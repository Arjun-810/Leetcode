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
    TreeNode common = null;
    public void com(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return;
        if(root.val == p.val || root.val == q.val){
            common = root;
            return;
        }
        if(root.val < p.val && root.val < q.val) com(root.right,p,q);
        else if(root.val >= p.val && root.val >= q.val) com(root.left,p,q);
        else{ 
            common  = root;
            return;
        }
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        common = root;
        com(root,p,q);
        return common;
        
    }
}