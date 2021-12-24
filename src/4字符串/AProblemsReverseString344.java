/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/3
 * Time: 18:44
 * Description: No Description
 */
public class AProblemsReverseString344 {

    public static void main(String[] args) {

    }

    class Solution {
        public void reverseString(char[] s) {

            int i=0,j=s.length-1;
            while (i<=j){
                char c=s[i];
                s[i]=s[j];
                s[j]=c;
                i++;
                j--;
            }
        }
    }
}
