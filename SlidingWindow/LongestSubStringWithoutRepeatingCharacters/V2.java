// Method 2
// LongestSubStringWithoutRepeatingCharacters
import java.util.*;
public class lfg{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int l=0,h=0,curr=0,max=0;
        HashSet<Character> set = new HashSet<>();
        while(h<n){ // code
            char ch = s.charAt(h); // update
            while(set.contains(ch)){ // shrinking condition
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch); 
            max=Math.max(h-l+1,max); // result update
            h++; // high pointer up
        }
        System.out.println(max);
    }
}
