import java.util.ArrayList;
import java.util.List;

/**
 * @author sykmile
 * @date 2018/3/11
 * @description
 */
public class Solution2 implements IBaseSolution{
    /**
     Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     Output: 7 -> 0 -> 8
     Explanation: 342 + 465 = 807.
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] m=getCharFromNode(l1);
        int[] n=getCharFromNode(l2);
        int len=m.length>n.length?m.length:n.length;
        int[] t=new int[len+1];
        int upInt=0;
        if(len==m.length){
            int temp;
            for(int i=0;i<len;i++){
                if(i+1>n.length){
                    temp=m[i]+upInt;
                }else{
                    temp=m[i]+n[i]+upInt;
                }
                upInt=0;
                if(temp>9){
                    t[i]=temp%10;
                    upInt=1;
                }else{
                    t[i]=temp;
                }
            }
        }else if(len==n.length){
            int temp;
            for(int i=0;i<len;i++){
                if(i+1>m.length){
                    temp=n[i]+upInt;
                }else{
                    temp=m[i]+n[i]+upInt;
                }
                upInt=0;
                if(temp>9){
                    t[i]=temp%10;
                    upInt=1;
                }else{
                    t[i]=temp;
                }
            }
        }
        t[t.length-1]=upInt;

        ListNode cur=null;
        ListNode temp=null;

        int loopLegth=t.length-1;
        if(t[t.length-1]==0){
            loopLegth-=1;
        }

        if(loopLegth==0){
            return new ListNode(t[0]);
        }

        for(int i=0;i<=loopLegth;i++){
            if(temp==null){
                temp=new ListNode(t[i]);
                cur=temp;
            }else {
                temp.next=new ListNode(t[i]);
                temp=temp.next;
            }
        }
        return cur;
    }
    public int[] getCharFromNode(ListNode node){
        List<Integer> addList=new ArrayList<>();
        while(node!=null){
            addList.add(node.val);
            node=node.next;
        }
        int[] resultArr=new int[addList.size()];
        int i=0;
        for(Integer item:addList){
            resultArr[i++]=item;
        }
        return resultArr;
    }


    ListNode nodePrint=null;

    public Solution2 localAddTwoNumbers(ListNode l1, ListNode l2){
        nodePrint=addTwoNumbers(l1,l2);
        return this;
    }
    @Override
    public void print2Console() {
        System.out.println("====addTwoNumbers====");
        while (nodePrint!=null){
            System.out.println(nodePrint.val+" ");
            nodePrint=nodePrint.next;
        }
        System.out.println();
        System.out.println("====addTwoNumbers====");
    }
}
