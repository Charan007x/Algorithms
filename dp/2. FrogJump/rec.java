/*  import java.util.*;
public class Main{  */
       // TC - o(2^n), SC - o(N) //

    public static int fun(int a[],int idx){
        if(idx==0) return 0;
        int left=fun(a,idx-1)+Math.abs(a[idx]-a[idx-1]);
        int right=Integer.MAX_VALUE;
        if(idx>1) right=fun(a,idx-2)+Math.abs(a[idx]-a[idx-2]);
        return Math.min(left,right);
    }


/*    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(fun(a,n-1));
    }
}   */
