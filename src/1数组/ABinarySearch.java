/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/11/29
 * Time: 10:23
 * Description: No Description
 */
public class ABinarySearch {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;

        System.out.println(s.search(nums, target));
        nums = new int[]{-1, 0, 3, 5, 9, 12};
        target = 2;
        System.out.println(s.search(nums, target));
        nums = new int[]{-1, 0, 5, 9, 12};
        target = 5;
        System.out.println(s.search(nums, target));

    }
}


class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, temp = left;
        while (left <= right)
            if (nums[temp] < target) {
                left++;
                temp = right;
            } else if (nums[temp] > target) {
                right--;
                temp = left;
            } else {
                return temp;
            }

        return -1;
    }
}

class Solution2 {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int mid = 0;
        while (left<=right){
            mid = (left+right) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        return -1;
    }
}