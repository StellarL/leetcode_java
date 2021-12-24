import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/10
 * Time: 16:41
 * Description: No Description
 */
public class CIntersectionOfTwoArrays349 {
    public static void main(String[] args) {

    }


    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            Set<Integer> res = new HashSet<>();
            for (int i=0;i<nums1.length;i++){
                set.add(nums1[i]);
            }
            for (int i=0;i<nums2.length;i++){
                if (set.contains(nums2[i])) res.add(nums2[i]);
            }
            int[] r=new int[res.size()];
            int j=0;
            for (Integer i:res){
                r[j++]=i;
            }
            return r;
        }
    }
}
