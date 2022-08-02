class Solution {
    public boolean isBip(int node, int[] col, int[][] graph){
        col[node] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            node = q.poll();
            for(int a: graph[node]){
                if(col[a] == -1){
                    q.add(a);
                    if(col[node] == 0) 
                        col[a] = 1;
                    else
                        col[a] = 0;
                }
                else if(col[a] == col[node]) return false;
            }
        }
        return true;
    } 
    public boolean isBipartite(int[][] graph) {
        int[] col = new int[graph.length];
        for(int i=0;i<graph.length;i++) col[i] = -1;
        for(int i=0;i<graph.length;i++){
            if(col[i] == -1)
                if(!isBip(i,col,graph)) return false;
        }
        return true;
    }
}