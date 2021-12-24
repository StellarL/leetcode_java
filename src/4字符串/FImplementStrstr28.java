/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/9
 * Time: 10:38
 * Description: No Description
 */
public class FImplementStrstr28 {

    public static void main(String[] args) {
        FImplementStrstr28 f = new FImplementStrstr28();
        Solution s = f.new Solution();
        System.out.println(s.strStr("aaaaa", "bba"));
        System.out.println(s.strStr("aabaabaafa", "aabaaf"));
        System.out.println(s.strStr("abc", "bc"));
        System.out.println(s.strStr("abc", "ab"));
        System.out.println(s.strStr("abc", "ac"));

    }

    class Solution {
        public int[] getNext(String s) {
            int[] tabel = new int[s.length()];
            tabel[0] = -1;
            for (int i = 1; i < s.length(); i++) {
                int begin = 0, end = i;
                int len = 0;
                while (begin < end && s.charAt(begin) == s.charAt(end)) {
                    len++;
                    begin++;
                    end--;
                }
                tabel[i] = len - 1;
            }
            return tabel;
        }

        public int strStr(String haystack, String needle) {
            if (needle.length() == 0) return 0;
            if (haystack.length() == 0) return -1;
            if (needle.length() > haystack.length()) return -1;
            int[] next = getNext(needle);
            int j = 0;
            for (int i = 0; i < needle.length(); i++) {
                if (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                    j = next[j - 1];
                }
                if (haystack.charAt(i) == needle.charAt(j)) {
                    j++;
                }
                if (j == needle.length()) return i - j + 1;
            }
            return 0;
        }
    }
}
