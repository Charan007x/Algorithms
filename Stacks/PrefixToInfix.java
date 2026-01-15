import java.util.*;
public class Pre_In {
    public static void main(String[] args) {
        String s="+*abc";
        Stack<String> st = new Stack<>();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z') st.push(Character.toString(ch));
            else{
                String x=st.pop();
                String y=st.pop();
                st.push("("+x+ch+y+")");
            }
        }
        System.out.println(st.pop());
    }
}
