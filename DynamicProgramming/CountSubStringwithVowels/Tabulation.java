// Tabulation Approach
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
        int dp[]=new int[n];
        dp[0]=(vow(ch)==true?1:0);
        for(int i=1;i<n;i++){
            ch=s.charAt(i);
            if(vow(ch)) dp[i]=i+1; // substrings upto i+1 are valid
            else dp[i]=dp[i-1]; // substrings upto i-1 are valid
        }
        int ans =0;
        for(int x:dp) ans+=x;
        System.out.println(ans);
    }
}
