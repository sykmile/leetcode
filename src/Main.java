public class Main {

    public static void main(String[] args) {
        int[] arr=new int[4];
        arr[0]=2;arr[1]=7;arr[2]=11;arr[3]=15;
        ClassBuilder.build(Solution.class).localTwoSum(arr,18).print2Console();

        ListNode temp=new ListNode(2);
        ListNode temp2=new ListNode(4);
        ListNode temp3=new ListNode(3);
        temp.next=temp2;temp2.next=temp3;
        ListNode temp4=new ListNode(5);
        ListNode temp5=new ListNode(6);
        ListNode temp6=new ListNode(4);
        temp4.next=temp5;temp5.next=temp6;
        ClassBuilder.build(Solution2.class).localAddTwoNumbers(temp,temp4).print2Console();
    }
}
