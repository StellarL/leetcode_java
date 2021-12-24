/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/11/30
 * Time: 20:02
 * Description: No Description
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode createList(int[] a){
        ListNode head=new ListNode(a[0]);
        ListNode cur=head;
        for (int i=1;i<a.length;i++){
            cur.next=new ListNode(a[i]);
            cur=cur.next;
        }
        return head;
    }
}
