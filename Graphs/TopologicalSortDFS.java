import java.util.*;
public class Topo {
    public static void main(String[] args) {
        int a[][]={{1,3},{2,3},{4,0},{4,1},{5,0},{5,2}}; // edges input
        int v=6,e=6;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++) adj.add(new ArrayList<>());
        for(int i=0;i<e;i++){
            int x=a[i][0];
            int y=a[i][1];
            adj.get(x).add(y); //dag
        }
        int vis[]=new int[v];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<v;i++){
            if(vis[i]==0){
                dfs(adj,vis,i,st); // dfs 
            }
        }
        while(!st.isEmpty()) System.out.print(st.pop()+" ");
    }
    public static void dfs(List<List<Integer>> adj,int vis[],int node,Stack<Integer> st){
        vis[node]=1;
        for(int i:adj.get(node)){
            if(vis[i]==0){
                dfs(adj,vis,i,st);
            }
        }
        st.push(node); // push after all its children
    }
}
