package 剑指offer;

import java.util.ArrayList;

//思路是用arraylist模拟一个队列来存储相应的TreeNode
public class a21_从上往下打印二叉树 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if (root == null)
            return list;
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode temp = queue.remove(0);
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
            list.add(temp.val);
        }
        return list;
    }
}