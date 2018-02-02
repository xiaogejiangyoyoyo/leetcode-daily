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
//思路：二叉搜索树按照中序遍历的顺序打印出来正好就是排序好的顺序。
//     所以，按照中序遍历顺序找到第k个结点就是结果。
class a61_二叉搜索树的第k个节点 {
    //计数器
    private int index = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot != null) {//中序遍历寻找第k个
            TreeNode node = KthNode(pRoot.left, k);
            if (node != null)
                return node;
            index++;
            if (index == k)
                return pRoot;
            node = KthNode(pRoot.right, k);
            if (node != null)
                return node;
        }
        return null;
    }
}