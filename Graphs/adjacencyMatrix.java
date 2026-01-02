public static int[][] buildAdj(int a[][]){
    // Find the maximum node value
    int maxNode = 0;
    for(int i=0; i<a.length; i++){
        maxNode = Math.max(maxNode, Math.max(a[i][0], a[i][1]));
    }
    
    int adj[][] = new int[maxNode+1][maxNode+1];
    
    for(int i=0; i<a.length; i++){
        int u = a[i][0];
        int v = a[i][1];
        adj[u][v] = 1;
        adj[v][u] = 1;  // Always fill both for undirected graphs
    }
    return adj;
}
