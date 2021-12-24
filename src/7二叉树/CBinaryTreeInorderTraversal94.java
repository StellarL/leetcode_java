import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/16
 * Time: 20:09
 * Description: No Description
 */
public class CBinaryTreeInorderTraversal94 {

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            pre(root, list);
            return list;
        }

        public void pre(TreeNode root, List<Integer> list) {

            if (root == null)
                return;
            pre(root.left, list);
            list.add(root.val);
            pre(root.right, list);



        }
    }
}
