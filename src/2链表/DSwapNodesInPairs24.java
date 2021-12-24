/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/2
 * Time: 10:51
 * Description: No Description
 */
public class DSwapNodesInPairs24 {
    public static void main(String[] args) {
        ListNode head=ListNode.createList(new int[]{1,2,3,4,5});
        DSwapNodesInPairs24 d=new DSwapNodesInPairs24();
        Solution s=d.new Solution();
        s.swapPairs(head);
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head==null) return null;
            if (head.next==null) return head;
            ListNode nHead=new ListNode();
            nHead.next=head;
            ListNode pre=head;
            ListNode tail=nHead;
            while (pre.next!=null && pre.next.next!=null){
                ListNode npre=pre.next.next;
                tail.next=pre.next;
                tail.next.next=pre;
                pre.next=npre;
                tail=pre;
                pre=npre;
            }
            if (pre.next==null) return nHead.next;
            else{
                tail.next=pre.next;
                pre.next=null;
                tail.next.next=pre;
                return nHead.next;
            }
        }
    }
}
