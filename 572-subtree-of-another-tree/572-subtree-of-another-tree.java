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
    
    public boolean check(TreeNode T, TreeNode S){
        if(T == null &&  S == null)
            return true;
        if(T == null || S == null)
            return false;
        
        boolean left = check(T.left, S.left);
        boolean right = check(T.right,S.right);
        if(T.val != S.val)
            return false;
        return left && right;
    }
    
    public boolean isSubtree(TreeNode T, TreeNode S) {
        if(T == null)
            return false;
        boolean left = isSubtree(T.left,S);
        boolean right = isSubtree(T.right,S);
        if(T.val == S.val)
            if(check(T,S))
                return true;
        return left || right;
    }
}