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
        while(h<n){
            char ch = s.charAt(h);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            max=Math.max(h-l+1,max);
            h++;
        }
        System.out.println(max);
    }
}
