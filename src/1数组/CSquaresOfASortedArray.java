import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/11/29
 * Time: 11:20
 * Description: No Description
 */
public class CSquaresOfASortedArray {
    public static void main(String[] args) {
        CSquaresOfASortedArray cSquaresOfASortedArray=new CSquaresOfASortedArray();
        Solution s=cSquaresOfASortedArray.new Solution();
        int[] nums=new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(s.sortedSquares(nums)));
        nums=new int[]{-7,-3,2,3,11};
        System.out.println(Arrays.toString(s.sortedSquares(nums)));
        nums=new int[]{1};
        System.out.println(Arrays.toString(s.sortedSquares(nums)));

    }
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int left=0,right=nums.length-1;
            int[] nNums=new int[nums.length];
            int i=nNums.length-1;
            while (left<=right){
                int a=nums[left]*nums[left];
                int b=nums[right]*nums[right];
                if(a>b){
                    nNums[i--]=a;
                    left++;
                }else {
                    nNums[i--]=b;
                    right--;
                }
            }
            return nNums;
        }
    }
}
