/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/2
 * Time: 10:25
 * Description: No Description
 */
public class CReverseLinkedList206 {
    public static void main(String[] args) {
        CReverseLinkedList206 c=new CReverseLinkedList206();
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
        ListNode n=s.reverseList(head);
        System.out.println("11");
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head==null) return null;
            if (head.next==null) return head;
            ListNode pre=head;
            head=head.next;
            pre.next=null;
            ListNode newHead=pre;
            while (head.next!=null){
                newHead=head;
                head=head.next;
                newHead.next=pre;
                pre=newHead;
            }
            head.next=newHead;
            return head;
        }
    }
}
