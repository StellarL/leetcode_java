import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/13
 * Time: 16:25
 * Description: No Description
 */
public class ETwoSum1 {


    class Solution {
        public int[] twoSum(int[] nums, int target) {
            if (nums.length<2) return null;
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i=0;i<nums.length;i++){
                if (map.containsKey(target-nums[i])){
                    return new int[]{i,map.get(target-nums[i])};
                }else {
                    map.put(nums[i],i);
                }
            }
            return null;
        }
    }
}
