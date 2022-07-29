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
    class Pair{
    TreeNode node;
    int row;
    int col;
    Pair(TreeNode node,int row,int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0,0));
        while(!q.isEmpty()){
            Pair temp = q.poll();
            TreeNode n = temp.node;
            int r = temp.row;
            int c = temp.col;
            if(!map.containsKey(r)){
                map.put(r,new TreeMap<>());
            }
            if(!map.get(r).containsKey(c)){
                map.get(r).put(c,new PriorityQueue<>());
            }
            map.get(r).get(c).offer(n.val);
            if(n.left!= null)
                q.offer(new Pair(n.left,r-1,c+1));
            if(n.right != null)
                q.offer(new Pair(n.right,r+1,c+1));
        }
        for (TreeMap < Integer, PriorityQueue < Integer >> ys: map.values()) {
            list.add(new ArrayList < > ());
            for (PriorityQueue < Integer > nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    }
}