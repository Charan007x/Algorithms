// Space Optimised Approach
import java.util.*;
public class New{
    public static boolean vow(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char ch = s.charAt(0);
        int prev=0,curr=0,total=0;
        for(int i=0;i<n;i++){
            ch=s.charAt(i);
            if(vow(ch)) curr=i+1; // substrings upto i+1 are valid
            else curr=prev; // substrings upto prev are valid
            total+=curr;
            prev=curr;
        }
        System.out.println(total);
    }
}
