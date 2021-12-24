/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/6
 * Time: 10:56
 * Description: No Description
 */
public class CTiHuanKongGeLcof05 {

    public static void main(String[] args) {

    }

    class Solution {
        public String replaceSpace(String s) {
            StringBuilder sb=new StringBuilder();
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)==' '){
                    sb.append("%20");
                }else {
                    sb.append(s.charAt(i));
                }

            }
            return sb.toString();
        }
    }
}
