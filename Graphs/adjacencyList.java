import java.util.*;
public class adjList {
    public static void main(String[] args) {
        int a[][]={{1,2},{1,3},{2,3},{2,4},{3,5},{4,5}};
        List<List<Integer>> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,Math.max(a[i][0],a[i][1]));
        }
        for(int i=0;i<=max;i++){
            list.add(new ArrayList<>());
        }
        buildAdj(a,list);
    }
    public static void buildAdj(int a[][],List<List<Integer>> list){
        int n=a.length;
        for(int i=0;i<n;i++){
            int u=a[i][0];
            int v=a[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
    }
}
