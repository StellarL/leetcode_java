import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/10
 * Time: 17:13
 * Description: No Description
 */
public class DHappyNumber202 {
    public static void main(String[] args) {
        DHappyNumber202 d=new DHappyNumber202();
        Solution s=d.new Solution();
        System.out.println(s.isHappy(1));
    }

    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> set=new HashSet<>();
            while (true) {
                if (set.contains(n)) return false;
                if (n==1) return true;
                set.add(n);
                int val = 0;
                //取每一位
                while (n >= 1) {
                    int a = n % 10;
                    val += a * a;
                    n /= 10;
                }
                n = val;
            }
        }
    }
}
