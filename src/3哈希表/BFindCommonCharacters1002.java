import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/9
 * Time: 21:00
 * Description: No Description
 */
public class BFindCommonCharacters1002 {

    public static void main(String[] args) {
        BFindCommonCharacters1002 b = new BFindCommonCharacters1002();
        Solution s = b.new Solution();
        System.out.println(s.commonChars(new String[]{"bella","label","roller"}));
        System.out.println(s.commonChars(new String[]{"cool","lock","cook"}));
        System.out.println(s.commonChars(new String[]{
                "acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"}));
    }

    class Solution {
        public List<String> commonChars(String[] words) {
            int[][] a = new int[words.length][26];
            for (int i = 0; i < words.length; i++) {
                for (char c : words[i].toCharArray()) {
                    a[i][c - 'a']++;
                }
            }
            List<String> list = new ArrayList<>();
            int n = words.length;
            for (int i = 0; i < a[0].length; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    if (a[j][i] < min) min = a[j][i];
                }
                while (min-- > 0) {
                    list.add(String.valueOf((char) (i + 'a')));
                }
            }
            return list;
        }
    }
}
