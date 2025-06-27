// Brute
import java.util.*;
public class New{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int curr=0,max=Integer.MIN_VALUE+1;
        for(int i=0;i<n;i++){
            curr=0;
            for(int j=i;j<n;j++){
               curr+=a[j];
                max=Math.max(curr,max);
            }
        }
        System.out.println(max);
    }
}
