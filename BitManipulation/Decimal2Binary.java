import java.util.*;
public class bits {
    public static void main(String[] args) {
        int n=6;
        StringBuilder sb=new StringBuilder();
      
        while(n!=0){
            int x=n%2;
            n/=2;
            sb.append(x);
        }
        System.out.println(sb.reverse().toString());
      
    }
}
