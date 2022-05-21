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
    public TreeNode deleteNode(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return replacer(root);
        TreeNode temp = root;
        while(root != null){
            if(root.val < val){
                if(root.right != null && root.right.val == val){
                    root.right = replacer(root.right);
                    break;
                }else root = root.right;
            }else{
                if(root.left != null && root.left.val == val){
                    root.left = replacer(root.left);
                    break;
                } else root = root.left;
            }
        }
        return temp;
    }
    public TreeNode replacer(TreeNode root){
        if(root.left == null && root.right == null) return null;
        else if( root.left == null) return root.right;
        else if(root.right == null) return root.left;
        else{
            TreeNode r = big(root.left);
            r.right = root.right;
            return root.left;
        }
    }
    public TreeNode big(TreeNode root){
        if(root .right == null) return root;
        return big(root.right);
    }
}