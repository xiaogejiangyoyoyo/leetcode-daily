import javax.swing.tree.TreeNode;

/**
 * public class TreeNode {
 * int val = 0;
 * TreeNode left = null;
 * TreeNode right = null;
 * <p>
 * public TreeNode(int val) {
 * this.val = val;
 * <p>
 * }
 * <p>
 * }
 */
//递归版本
public class Solution {
        

    {
            if (pRoot == null) {
                return 0;
            }
            int left = TreeDepth(pRoot.left);
            int right = TreeDepth(pRoot.right);
            return Math.max(left, right) + 1;
        }
        

    public int TreeDepth(TreeNode pRoot)
}