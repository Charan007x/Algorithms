import java.util.*;
public class longestSubArrayTargetSub {
    public static void main(String[] args) {
        int a[]={2,3,-3,4};
        int n=a.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0,ans=0,k=2;
        
        // max len subarray logic
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(!map.containsKey(sum)) map.put(sum,i);
            if(map.containsKey(sum-k)) ans=Math.max(ans,i-map.get(sum-k));
        }
        System.out.println(ans);
    }
}
