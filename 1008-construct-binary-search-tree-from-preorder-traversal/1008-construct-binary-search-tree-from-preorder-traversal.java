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
    public TreeNode construct(int[] preorder,int p_start,int p_end,int[] inorder,int i_start,int i_end,HashMap<Integer,Integer> map){
        if(p_start > p_end || i_start > i_end) return null;
        System.out.println(p_start+" "+p_end);
        TreeNode root = new TreeNode(preorder[p_start]);
        int i_root = map.get(root.val);
        int i_left = i_root-i_start;
        root.left = construct(preorder,p_start+1,p_start+i_left,inorder,i_start,i_root-1,map);
        root.right = construct(preorder,p_start+i_left+1,p_end,inorder,i_root+1,i_end,map);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
        int inorder[]=preorder.clone();Arrays.sort(inorder);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<preorder.length;i++)
            map.put(inorder[i],i);
        return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    }
}