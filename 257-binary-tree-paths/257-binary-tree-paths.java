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
    public void allPath(TreeNode root,List<Integer> path,List<String> res){
        if(root == null){
            return;
        }
        path.add(root.val);
        allPath(root.left,path,res);
        allPath(root.right,path,res);
        if(root.left == null && root.right == null){
            String temp = "";
            for(int i=0;i<path.size()-1;i++)
                temp += path.get(i)+"->";
            temp+=path.get(path.size()-1);
            res.add(temp);
        }
        path.remove(path.size()-1);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        allPath(root,path,res);
        return res;
    }
}