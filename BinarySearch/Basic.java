// Basic Binary Search
import java.util.*;
public class Main{
public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int a[] = new int[n];
  for(int i=0;i<n;i++) a[i]=sc.nextInt();
  int tar = sc.nextInt();
  int l=0,h=n-1;
  while(l<=h){
    int m = l+(r-l)/2; // prevent overflow // can also use long
    if(a[m]==tar){
      System.out.println(m);
      return;
    }
  }
}
}
