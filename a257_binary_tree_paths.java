/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret=new ArrayList();
        if(root==null)
            return ret;
        dfs(root,"",ret);
        return ret;
    }
    
    private void dfs(TreeNode root,String prefix,List<String> ret){
        if(root==null)
            return;
        if(root.left==null&&root.right==null){
            ret.add(prefix+root.val);
            return;
        }
        prefix+=(root.val+"->");
        dfs(root.left,prefix,ret);
        dfs(root.right,prefix,ret);
    }
}