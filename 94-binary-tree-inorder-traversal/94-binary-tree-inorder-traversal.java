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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // if(roo)
        while(root != null){
            if(root.left == null){
                list.add(root.val);
                root = root.right;
            }
            else{
                TreeNode prev = root.left;
                while(prev.right != null && prev.right != root){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = root;
                    root = root.left;
                }
                else{
                    prev.right = null;
                    list.add(root.val);
                    root = root.right;
                }
            }
        }
        return list;
    }
}











// class Solution {
//     public void inorder(TreeNode root, List<Integer> list){
//         if(root == null) return;
//         inorder(root.left,list);
//         list.add(root.val);
//         inorder(root.right,list);
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         inorder(root,list);
//         return list;
//     }
// }