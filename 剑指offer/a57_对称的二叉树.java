package 剑指offer;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
*/
//超简单java递归版本
public class a57_对称的二叉树 {
    boolean isSymmetrical(TreeNode pRoot) {
        return is(pRoot, pRoot);
    }

    private boolean is(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.val == t2.val)
            return is(t1.left, t2.right) && is(t1.right, t2.left);
        else
            return false;
    }
}