package 剑指offer;

//改编自求树高代码，平衡的子树高度正常求，不平衡的直接设为-1
public class a38_平衡二叉树 {

    private int cheat(TreeNode root) {
        if (root == null)
            return 0;
        int left = cheat(root.left);
        int right = cheat(root.right);
        return (left >= 0 && right >= 0 && Math.abs(left - right) <= 1) ? 1 + Math.max(left, right) : -1;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        return cheat(root) >= 0;
    }
}