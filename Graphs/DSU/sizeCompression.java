import java.util.*;
public class DSU{
    int parent[];
    int size[];
    DSU(int n){
        parent = new int[n+1];
        size = new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    int find(int x){
        if(parent[x]==x) return x;
        return parent[x] = find(parent[x]);
    }
    void union(int x,int y){
        int pa=find(x);
        int pb=find(y);
        if(pa==pb) return;
        if(size[pa]<size[pb]){
            parent[pa]=pb;
            size[pb]+=size[pa];
        }else{
            parent[pb]=pa;
            size[pa]+=size[pb];
        }
    }
    public static void main(String[] args) {
        DSU dsu = new DSU(5);
        dsu.union(1,2);
        dsu.union(2,3);
        dsu.union(4,5);
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=1;i<=5;i++){
            if(!map.containsKey(dsu.find(i))) map.put(dsu.find(i),new ArrayList<>());
            map.get(dsu.find(i)).add(i);
        }
        for(int key:map.keySet()){
            System.out.print(map.get(key)+" ");
        }
    }
}
