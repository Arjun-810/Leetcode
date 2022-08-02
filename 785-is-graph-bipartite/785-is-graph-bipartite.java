class Solution {
    public boolean isBip(int node, int[] col, int[][] edges){
        for(int a: edges[node]){
            if(col[a] == -1){
                col[a] = 1-col[node];
                if(!isBip(a,col,edges)) return false;
            }
            else if(col[a] == col[node]) return false;
        }
        return true;
    } 
    public boolean isBipartite(int[][] edges) {
        int n = edges.length;
        int[] col = new int[n];
        for(int i=0;i<n;i++) col[i] = -1;
        for(int i=0;i<n;i++){
            if(col[i] == -1){
               col[i] = 0;
               if(!isBip(i,col,edges)) return false;
            }
        }
        return true;
    }
}