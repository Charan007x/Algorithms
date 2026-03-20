import java.util.*;
public class countSubarrays {
    public static void main(String[] args) {
        int a[]={3,-1,2,4};
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,count=0,k=2;

        // count subarrays logic
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=a[i]; // summation
            if(map.containsKey(sum-k)){ // only count if we have encountered in the map
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1); // put every sum in the map
        }


        System.out.println(count);
    }
}
