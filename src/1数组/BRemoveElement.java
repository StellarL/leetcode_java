/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/11/29
 * Time: 11:06
 * Description: No Description
 */
public class BRemoveElement {
    public static void main(String[] args) {
        int[]nums =new int[]{3,2,2,3};
        int val = 3;
        BRemoveElement bremoveElement=new BRemoveElement();
        Solution s= bremoveElement.new Solution();
        System.out.println(s.removeElement(nums,val));
        nums =new int[]{0,1,2,2,3,0,4,2};
        val = 2;
        System.out.println(s.removeElement(nums,val));
    }

    class Solution {
        public int removeElement(int[] nums, int val) {
            int i=0,temp=0;
            for(i=0;i<nums.length;i++){
                if (nums[i]==val)continue;
                nums[temp]=nums[i];
                temp++;
            }
            return temp;
        }
    }
}


