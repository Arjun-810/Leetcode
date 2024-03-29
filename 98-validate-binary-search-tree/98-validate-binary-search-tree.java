/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean checkBst(TreeNode root, TreeNode min, TreeNode max){
        if(root == null) return true;
        
        if((min!=null && min.val>=root.val) || (max!=null && max.val<=root.val)) return false;
         
        
        return checkBst(root.left, min, root) && checkBst(root.right,root, max);
        
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return checkBst(root, null, null);
    }
}