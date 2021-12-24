/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/3
 * Time: 9:52
 * Description: No Description
 */
public class GLinkedListCycleIi142 {
    public static void main(String[] args) {

    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head==null) return null;
            if (head.next==null) return null;
            if (head.next.next==null) return null;
            if (head.next.next==head) return head;
            ListNode slow=head.next;
            ListNode quick=head.next.next;
            while (slow!=quick && slow.next!=null &&quick.next!=null && quick.next.next!=null){
                quick=quick.next.next;
                slow=slow.next;
            }
            if (slow.next==null||quick.next==null||quick.next.next==null) return null;
            int len=1;
            if (slow==quick) {
                while (slow.next!=quick){
                    slow=slow.next;
                    len++;
                }
            }
            slow=head;
            quick=head;
            for (int i=0;i<len;i++){
                quick=quick.next;
            }
            while (slow!=quick){
                slow=slow.next;
                quick=quick.next;
            }
            return slow;
        }
    }
}
