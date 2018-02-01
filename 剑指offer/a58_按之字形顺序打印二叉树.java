import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;

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
public class Solution {
   
    private ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
   

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {         if (pRoot == null) {
           return res;
       }
       ArrayDeque<TreeNode> queue = new ArrayDeque();
       queue.add(pRoot);
       boolean direction = true;
       TreeNode left = pRoot, right = pRoot;
       ArrayList<Integer> list = new ArrayList<>();
       while (queue.size() != 0) {
            // true 代表从左至右， false 代表从右至左
           if (direction) {
               TreeNode p = queue.poll();
               list.add(p.val);
               if (p.left != null) {
                   queue.add(p.left);
               }
               if (p.right != null) {
                   queue.add(p.right);
               }
               if (p == right) {
                   left = queue.peek();
                   res.add(list);
                   list = new ArrayList<Integer>();
                   direction = !direction;
               }
           } else {
               TreeNode p = queue.pollLast();
               list.add(p.val);
               if (p.right != null) {
                   queue.addFirst(p.right);
               }
               if (p.left != null) {
                   queue.addFirst(p.left);
               }
               if (p == left) {
                   right = queue.peekLast();
                   res.add(list);
                   list = new ArrayList<Integer>();
                   direction = !direction;
               }
           }
       }
       return res;
   }
}