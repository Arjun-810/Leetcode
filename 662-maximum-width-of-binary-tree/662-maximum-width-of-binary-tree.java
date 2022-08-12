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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int max = 0;
        root.val = 1;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int left = q.peek().val;
            int right = 0;
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                right = temp.val;
                if(temp.left!= null){
                    temp.left.val = temp.val*2-1;
                    q.add(temp.left);
                }
                if(temp.right != null){
                    temp.right.val = temp.val*2;
                    q.add(temp.right);
                }
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}