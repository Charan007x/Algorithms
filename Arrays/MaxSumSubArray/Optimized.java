// Kadane's Algorithm
import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int curr=a[0],max=a[0];
        for(int i=0;i<n;i++){
            curr=Math.max(curr+a[i],a[i]);
            max=Math.max(curr,max);
        }
        System.out.println(max);
    }
}
