import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/12/16
 * Time: 16:23
 * Description: No Description
 */
public class BBinaryTreePostorderTraversal145 {

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list=new ArrayList<>();
            pre(root,list);
            return list;
        }

        public void pre(TreeNode root,List<Integer> list){

            if (root==null)
                return;
            pre(root.left,list);
            pre(root.right,list);
            list.add(root.val);


        }

    }
}
