/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/7
 * Time: 9:43
 * Description: No Description
 */
public class EZuoXuanZhuanZiFuChuanLcof58 {
    public static void main(String[] args) {

    }

    class Solution {
        public String reverseLeftWords(String s, int n) {
            if (n>=s.length()) return s;
            StringBuilder sb=new StringBuilder();
            for (int i=n;i<s.length();i++){
                sb.append(s.charAt(i));
            }
            for (int i=0;i<n;i++){
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }
    }
}
