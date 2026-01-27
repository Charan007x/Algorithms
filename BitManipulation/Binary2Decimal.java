import java.util.*;
public class bits {
    public static void main(String[] args) {
        String s="1101";
        int n=s.length();
      
        int ans=0,x=0;
        for(int i=n-1;i>=0;i--){
            int b=s.charAt(i)-'0';
            ans=ans+(b*(int)Math.pow(2,x));
            x++;
        }
        System.out.println(ans);
      
    }
}
