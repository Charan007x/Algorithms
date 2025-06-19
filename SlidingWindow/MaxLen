import java.util.*;
public class lfg{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int l=0,h=0,sum=0,max=0;
        int tar = sc.nextInt();
        while(h<n){ // logic
            sum+=a[h]; // update
            while(sum>tar&&l<=h){ // condition
                sum-=a[l]; // decrease the size
                l++;
            }
            if(sum==tar) max=Math.max(max,h-l+1); // final ans update
            h++; // increment
        }
        System.out.println(max);
    }
}
