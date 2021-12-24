import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/13
 * Time: 21:18
 * Description: No Description
 */
public class GRansomNote383 {

    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] arr = new int[26];
            for (int i = 0; i < magazine.length(); i++) {
                arr[magazine.charAt(i) - 'a']++;
            }
            for (int i = 0; i < ransomNote.length(); i++) {
                if (arr[ransomNote.charAt(i)-'a']==0)return false;
                else {
                    arr[ransomNote.charAt(i)-'a']-=1;
                }
            }
            return true;
        }
    }
}
