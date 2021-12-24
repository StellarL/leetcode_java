import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/16
 * Time: 20:12
 * Description: No Description
 */
public class DBinaryTreeLevelOrderTraversal102 {
    public static void main(String[] args) {
        DBinaryTreeLevelOrderTraversal102 d=new DBinaryTreeLevelOrderTraversal102();
        Solution s=d.new Solution();
        TreeNode node=new TreeNode(3);
        TreeNode root=node;
        node.left=new TreeNode(9);
        node.right=new TreeNode(20);
        TreeNode n=node.right;
        n.left=new TreeNode(15);
        n.right=new TreeNode(7);
        s.levelOrder(root);
    }


    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) return null;
            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> res = new ArrayList<>();
            queue.add(root);
            int n=0;
            while (queue.size()!=0) {
                List<Integer> list = new ArrayList<>();
                n=queue.size();
                for (int i=0;i<n;i++){
                    TreeNode temp = queue.poll();
                    list.add(temp.val);

                    if (temp.left != null) queue.add(temp.left);
                    if (temp.right != null) queue.add(temp.right);
                }

                res.add(list);
            }
            return res;
        }
    }
}
