/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/11/29
 * Time: 15:07
 * Description: No Description
 */
public class DMinimumSizeSubarraySum209 {
    public static void main(String[] args) {
        DMinimumSizeSubarraySum209 dMinimumSizeSubarraySum209=new DMinimumSizeSubarraySum209();
        Solution s = dMinimumSizeSubarraySum209.new Solution();
        int target = 7;
        int[] nums =new int[]{2,3,1,2,4,3};
        System.out.println(s.minSubArrayLen(target,nums));
        target=4;
        nums =new int[]{1,4,4};
        System.out.println(s.minSubArrayLen(target,nums));
        target=11;
        nums =new int[]{1,1,1,1,1,1,1,1};
        System.out.println(s.minSubArrayLen(target,nums));
        target=1;
        nums =new int[]{0};
        System.out.println(s.minSubArrayLen(target,nums));
        target=2;
        nums =new int[]{1,1,1,1,1,1,1,1};
        System.out.println(s.minSubArrayLen(target,nums));
    }

    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int len=Integer.MAX_VALUE;
            int left=0,right=0;
            int sum=0;
            while (left<=right && right<nums.length){
                sum+=nums[right++];
                while (sum>=target) {
                    len=len>right-left?right-left:len;
                    sum-=nums[left++];
                }
            }
            return len==Integer.MAX_VALUE?0:len;
        }
    }
}
