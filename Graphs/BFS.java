import java.util.*;
public class bfs{
    public static void main(String[] args){
        int edges[][]={{1,2},{2,3},{1,4},{4,5},{1,5},{2,0}};
        List<List<Integer>> adj=new ArrayList<>();
        int n=5;
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int x=edges[i][0],y=edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        int vis[]=new int[n+1];
        fun(2,vis,adj);
    }
    public static void fun(int node,int vis[],List<List<Integer>> adj){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        vis[node]=1;
        while(q.size()>0){ 
            int sz=q.size(); // preserve size for level
            for(int j=0;j<sz;j++){
                int temp=q.poll();
                System.out.print(temp+" ");
                for(int i:adj.get(temp)){ // visit all connected nodes
                    if(vis[i]==0){
                        q.add(i);
                        vis[i]=1; // mark them visited
                    }
                }
            }
            System.out.println();
        }
    }
}
