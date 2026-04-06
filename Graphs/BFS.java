import java.util.*;
public class graphr {
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
        
        int vis[]=new int[v+1]; // create visited array
        List<Integer> ans=new ArrayList<>();
        vis[1]=1; // visited 1st node
        ans.add(1);
        Queue<Integer> q=new LinkedList<>();
        q.add(1); // add the first node in the queue
        while(!q.isEmpty()){
            int temp=q.poll();
            for(int i:adj.get(temp)){ 
                if(vis[i]==0){  // if the node not visited 
                    vis[i]=1;
                    q.add(i);
                    ans.add(i);
                }
            }
        }
        System.out.println(ans);
    }
}
