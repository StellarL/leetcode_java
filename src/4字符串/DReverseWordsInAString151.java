/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/6
 * Time: 11:02
 * Description: No Description
 */
public class DReverseWordsInAString151 {
    public static void main(String[] args) {
        DReverseWordsInAString151 d=new DReverseWordsInAString151();
        Solution s=d.new Solution();
        s.reverseWords("  Bob    Loves  Alice   ");
    }

    class Solution {
        public String reverseWords(String s) {
            s=s.trim();
            int i=s.length()-1;
            int j=s.length()-1;
            StringBuilder sb=new StringBuilder();
            while (i>=0&&j>=0) {
                while (i>=0&&s.charAt(i) != ' ') {
                    i--;
                }
                sb.append(s.substring(i+1,j+1)+" ");
                while (i>=0&&s.charAt(i)==' '){
                    i--;
                }
                j=i;
            }
            return sb.toString().trim();
        }
    }
}
