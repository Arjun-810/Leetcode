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
    public boolean getPath(TreeNode root, TreeNode target,ArrayList<TreeNode> arr){
        if(root == null) return false;
        arr.add(root);
        if(root  == target) return true;
        if(getPath(root.left,target,arr) || getPath(root.right,target,arr)) return true;
        arr.remove(arr.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> route_p = new ArrayList<>();
        ArrayList<TreeNode> route_q = new ArrayList<>();
        boolean a = getPath(root,p,route_p);
        boolean b = getPath(root,q,route_q);
        int i=0,j=0;
        // for(TreeNode x : route_p) System.out.println(x.val);
        //         for(TreeNode x : route_q) System.out.println(x.val);
        TreeNode same = null;
        while(i<route_p.size() && j<route_q.size()){
            if(route_p.get(i) != route_q.get(j)) break;
            same = route_p.get(i);
            i++;
            j++;
        }
        return same;
    }
}