import java.util.*;
public class LearnHeap {
    public static void main(String[] args) {
        int a[]={3,2,1,2,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++) map.put(a[i],map.getOrDefault(a[i],0)+1);
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(
                (x,y)->{
                    if((map.get(x)).equals(map.get(y))) return Integer.compare(y,x); // return higher value then lower if collison exists
                    return Integer.compare(map.get(x),map.get(y)); // return lowest frequency element if no collision
                }
        );
        for(int i=0;i<a.length;i++) pq.add(a[i]); // always add the elements into the Priority Queue
        
        
        while(pq.size()>0) System.out.print(pq.poll()+" ");
    }
}

// Note :
// Always use .equals() as using == will cause issues in java. 
