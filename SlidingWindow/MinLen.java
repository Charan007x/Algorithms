// minLen for tar sum
import java.util.*;
public class lfg{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++) a[i]= sc.nextInt();
        int tar = sc.nextInt();
        int l=0,h=0,sum=0,min=Integer.MAX_VALUE;
        while(h<n){
            sum+=a[h];
            while(sum>=tar&&l<=h){
                if(sum==tar) min=Math.min(min,h-l+1);
                sum-=a[l];
                l++;
            }
            h++;
        }
        System.out.println(min==Integer.MAX_VALUE?0:min);
    }
}
