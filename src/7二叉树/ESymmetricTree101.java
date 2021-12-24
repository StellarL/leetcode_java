/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/16
 * Time: 20:52
 * Description: No Description
 */
public class ESymmetricTree101 {

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root.left==null&&root.right==null) return true;
            else if (root.left!=null&&root.right!=null){
                if (root.left.val!=root.right.val) return false;
                else {
                    return isSymmetric(root.left)&&isSymmetric(root.right);
                }
            }else {
                return false;
            }
        }
    }
}
