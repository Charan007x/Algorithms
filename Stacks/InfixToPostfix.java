import java.util.*;
public class In_Po {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s="a+b*c/d-e";
        int n=s.length();
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z') sb.append(ch);
            else{
                if(st.isEmpty()) st.push(ch);
                else if(ch=='(') st.push(ch);
                else if(ch==')'){
                    while(st.peek()!='(') sb.append(st.pop());
                    st.pop();
                }
                else{
                    while(st.size()>0&&priority(st.peek())>=priority(ch)) sb.append(st.pop());
                    st.push(ch);
                }
            }
        }
        while(st.size()!=0) sb.append(st.pop());
        System.out.println(sb.toString());
    }
    public static int priority(char ch){
        if(ch=='^') return 3;
        else if(ch=='*'||ch=='/') return 2;
        else if(ch=='+'||ch=='-') return 1;
        return 0;
    }
}
