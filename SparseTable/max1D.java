import java.util.*;
public class sparse {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 4, 6, 1, 3};
        int n=a.length;
        int K=(int)(Math.log(n)/Math.log(2))+1; // total levels
        int st[][]=new int[K][n];
        for(int i=0;i<n;i++) st[0][i]=a[i]; // level 0 sparse table

        for(int k=1;k<K;k++){
            int sz=(int)(Math.pow(2,k));
            for(int i=0;i+sz<=n;i++){
                st[k][i]=Math.max(st[k-1][i],st[k-1][i+(sz/2)]);
            }
        }
        // print Sparse Table
//        for(int i=0;i<K;i++){
//            for(int j=0;j<n-(int)(Math.pow(2,i))+1;j++){
//                System.out.print(st[i][j]+" ");
//            }
//            System.out.println();
//        }
        int l=4,h=4,k=(int)(Math.log(h-l+1)/Math.log(2)); // query[L,H] inclusive
        System.out.println(Math.max(st[k][l],st[k][h+1-(int)(Math.pow(2,k))]));
    }
}
