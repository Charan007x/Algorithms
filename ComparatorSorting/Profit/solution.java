import java.util.*;
public class test {
    public static void main(String[] args) {
        int a[]={2, 1, 2};
        int b[]={30, 10, 20};
        int n=a.length;
        Integer idx[]=new Integer[n];
        for(int i=0;i<n;i++) idx[i]=i;
        Arrays.sort(idx,(i,j)->{
            if(a[i]!=a[j]) return  a[i]-a[j];
            return b[j]-b[i];
        });
        int c[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=a[idx[i]];
            d[i]=b[idx[i]];
        }
        for(int i=0;i<n;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(d[i]+" ");
        }
    }
}
