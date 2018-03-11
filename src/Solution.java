import java.util.ArrayList;
import java.util.List;

/**
 * @author sykmile
 * @date 2018/3/11
 * @description
 */
public class Solution implements IBaseSolution {
    /**
     Given nums = [2, 7, 11, 15], target = 9,
     Because nums[0] + nums[1] = 2 + 7 = 9,
     return [0, 1].
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++ ){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return null;
    }

    int[] arr=null;

    public Solution localTwoSum(int[] nums, int target){
        arr=twoSum(nums,target);
        return this;
    }

    @Override
    public void print2Console() {
        System.out.println("====twoSum====");
        for(int i:arr){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("====twoSum====");
    }
}
