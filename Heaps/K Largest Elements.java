// Top k largest elements
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans[]=new int[k];
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            if(pq.size()<k) pq.add(a[i]); // maintain fixed size
            else if(a[i]>pq.peek()){ 
                pq.poll();
                pq.add(a[i]);
            }
        }
        for(int i=0;i<k;i++) ans[i]=pq.poll();
        for(int i=0;i<k;i++) System.out.print(ans[i]+" ");
    }
}
// TC - n(logk)
// SC - o(n)
