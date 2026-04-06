import java.util.*;
public class graphdfs {
    public static void main(String[] args) {
        int a[][]={{1,2},{1,4},{2,4},{2,3},{4,5},{3,5}}; // edges input
        int v=5,e=6;
        List<List<Integer>> adj=new ArrayList<>();
        //build adjacency list
        for(int i=0;i<v+1;i++) adj.add(new ArrayList<>());
        for(int i=0;i<e;i++){
            int x=a[i][0];
            int y=a[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        int vis[]=new int[v+1];
        List<Integer> list=new ArrayList<>();
        fun(adj,1,vis,list);
        System.out.println(list);
    }
    public static void fun(List<List<Integer>> adj,int node,int vis[],List<Integer> list){
        if(vis[node]==1) return; // return if already visited
        vis[node] = 1; // mark as visited
        list.add(node); 
        for(int i:adj.get(node)){
            if(vis[i]==0) {
                fun(adj,i,vis,list);
            }
        }
    }
}
