package 剑指offer;
/* 先前序遍历这棵树的每个结点，如果遍历到的结点有子结点，就交换它的两个子节点，
当交换完所有的非叶子结点的左右子结点之后，就得到了树的镜像 */

class TreeNode2 {
    int val;
    TreeNode2 left = null;
    TreeNode2 right = null;

    public TreeNode2(int val) {
        this.val = val;
    }
}

public class a17_二叉树的镜像 {
    private void Mirror(TreeNode2 root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        TreeNode2 pTemp = root.left;
        root.left = root.right;
        root.right = pTemp;

        if (root.left != null) Mirror(root.left);
        if (root.right != null) Mirror(root.right);
    }
}