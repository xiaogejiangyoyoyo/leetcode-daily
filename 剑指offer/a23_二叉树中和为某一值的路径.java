package 剑指offer;

import java.util.ArrayList;

public class a23_二叉树中和为某一值的路径 {
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    private ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null)
            return listAll;
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null)
            listAll.add(new ArrayList<>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return listAll;
    }
}