import java.util.*;
public class prefix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={3,1,2,4};
        int n=a.length;
        int pre[]=new int[n+1];
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+a[i-1];
        }
        int l=sc.nextInt(),h=sc.nextInt();

        // range sum query for 1D prefix sum
        System.out.println(pre[h+1]-pre[l]);  
        // prefix sum for [l,h] inclusive is pre[h+1]-pre[l]
    }
}
