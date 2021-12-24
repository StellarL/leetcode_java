/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/11/30
 * Time: 20:01
 * Description: No Description
 */

public class ARemoveLinkedListElements203 {

    public static ListNode getHead(int[] arr){
        ListNode head=new ListNode(arr[0]);
        ListNode cur=head;
        for (int i=1;i<arr.length;i++){
            head.next=new ListNode(arr[i]);
            head=head.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        ARemoveLinkedListElements203 a=new ARemoveLinkedListElements203();
        Solution s=a.new Solution();
        int[] arr=new int[]{1,2,6,3,4,5,6};
        ListNode head=getHead(arr);
        ListNode n1 = s.removeElements(head,6);
        arr=new int[]{1};
        head=getHead(arr);
        ListNode n2 = s.removeElements(head,2);
        System.out.println(1);
    }
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) return  null;
            ListNode newHead = new ListNode();
            ListNode cur=newHead;
            while (head!=null){
                if (head.val!=val){
                    cur.next=head;
                    cur=cur.next;

                }
                head=head.next;
            }
            cur.next=null;
            return newHead.next;
        }
    }
}
