// works for all Integers
// LeetCode 560
import java.util.*;
public class New{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int tar = sc.nextInt();
        int l=0,h=0,sum=0,count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        while(h<n){
            sum+=a[h];
            if(map.containsKey(sum-tar)) count+=map.get(sum-tar);
            map.put(sum,map.getOrDefault(sum,0)+1);
            h++;
        }
        System.out.println(count);
    }
}
