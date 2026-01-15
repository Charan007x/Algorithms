import java.util.*;
public class Po_In {
    public static void main(String[] args) {
        String s="ab+c*";
        Stack<String> st = new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z') st.push(Character.toString(ch));
            else{
                String y=st.pop();
                String x=st.pop();
                st.push("("+x+ch+y+")");
            }
        }
        System.out.println(st.pop());
    }
}
