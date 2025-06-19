//longest substring without repeating characters
import java.util.*;
public class lfg{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        HashSet<Character> set = new HashSet<>();
        int l=0,h=0,max=0,curr=0;
        while(h<n){
            if(!set.contains(s.charAt(h))){
                set.add(s.charAt(h));
                curr=h-l+1;
                max=Math.max(curr,max);
                h++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        System.out.println(max);
    }
}
