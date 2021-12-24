/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/2
 * Time: 9:25
 * Description: No Description
 */
public class ConsecutiveCharacters1446 {

    public static void main(String[] args) {
        ConsecutiveCharacters1446 consecutiveCharacters1446=new ConsecutiveCharacters1446();
        Solution s=consecutiveCharacters1446.new Solution();
        System.out.println(s.maxPower("leetcode"));
        System.out.println(s.maxPower("abbcccddddeeeeedcba"));
        System.out.println(s.maxPower("triplepillooooow"));
        System.out.println(s.maxPower("hooraaaaaaaaaaay"));
        System.out.println(s.maxPower("tourist"));
    }

    class Solution {
        public int maxPower(String s) {
            if (s.length()==0)return 0;
            char pre=s.charAt(0);
            int len=1;
            int max=1;
            for (int i=1;i<s.length();i++){
                if (s.charAt(i)==pre) len++;
                else {
                    pre=s.charAt(i);
                    len=1;
                }
                if(len>max)max=len;
            }
            return max;
        }
    }
}
