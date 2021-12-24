/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/3
 * Time: 9:32
 * Description: No Description
 */
public class FIntersectionOfTwoLinkedListsLcci07 {
    public static void main(String[] args) {

    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA==null || headB==null) return null;

            int lena=1;
            int lenb=1;
            ListNode cura=headA;
            ListNode curb=headB;
            while (cura.next!=null){
                cura=cura.next;
                lena++;
            }
            while (curb.next!=null){
                curb=curb.next;
                lenb++;
            }
            if (lena==0||lenb==0) return null;
            cura=headA;
            curb=headB;
            if (lena>lenb){
                int a=lena-lenb;
                for (int i=0;i<a;i++){
                    cura=cura.next;
                }
            }else {
                int b=lenb-lena;
                for (int i=0;i<b;i++){
                    curb=curb.next;
                }
            }
            while (cura!=curb && cura.next!=null && curb.next!=null){
                cura=cura.next;
                curb=curb.next;
            }
            if (cura.next!=null && curb.next!=null) return cura;
            else if (cura==curb) return cura;
            else return null;
        }
    }
}
