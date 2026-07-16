import java.util.*;
public class DSU{
    int parent[];
    DSU(int n){ // create Parent Array
        parent = new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
        }
    }
    int find(int x){ // find 
        if(parent[x]==x) return x;
        return parent[x] = find(parent[x]);
    }
    void union(int x,int y){ // take union
        int pa=find(x);
        int pb=find(y);
        if(pa!=pb) parent[pb]=pa;
    }
    public static void main(String[] args) {
        DSU dsu = new DSU(5);
        dsu.union(1,2);
        dsu.union(2,3);
        dsu.union(4,5);
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=1;i<=5;i++){ // take connected components
            if(!map.containsKey(dsu.find(i))) map.put(dsu.find(i),new ArrayList<>());
            map.get(dsu.find(i)).add(i);
        }
        for(int key:map.keySet()){
            System.out.print(map.get(key)+" ");
        }
    }
}
