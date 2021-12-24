/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/16
 * Time: 16:24
 * Description: No Description
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
