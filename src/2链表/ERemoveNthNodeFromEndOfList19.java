/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/2
 * Time: 17:25
 * Description: No Description
 */
public class ERemoveNthNodeFromEndOfList19 {

    public static void main(String[] args) {
        ERemoveNthNodeFromEndOfList19 c=new ERemoveNthNodeFromEndOfList19();
        Solution s=c.new Solution();
        ListNode head=new ListNode(1);
        ListNode cur=head;
        cur.next=new ListNode(2);
        cur=cur.next;
        cur.next=new ListNode(3);
        cur=cur.next;
        cur.next=new ListNode(4);
        cur=cur.next;
        cur.next=new ListNode(5);
        ListNode n=s.removeNthFromEnd(head,2);
        System.out.println("11");
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head==null) return null;
            ListNode quick=head;
            ListNode slow=head;
            while (quick.next!=null){
                quick=quick.next;
                if (n!=0){
                    n--;
                }else {
                    slow=slow.next;
                }
            }
            if (n==1){
                return head.next;
            }
            if (slow.next.next==null)slow.next=null;
            else{
                slow.next=slow.next.next;
            }
            return head;
        }
    }
}
