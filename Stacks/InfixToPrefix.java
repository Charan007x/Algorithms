import java.util.*;
class In_Pre{
    public static void main(String[] args) {
        String s="(a+b)*c";
        int n=s.length();
        StringBuilder rev=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='(') rev.append(')');
            else if(ch==')') rev.append('(');
            else rev.append(ch);
        }
        String ans=toPost(rev.toString());
        rev=new StringBuilder(ans).reverse();
        ans=rev.toString();
        System.out.println(ans);
    }
    public static String toPost(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int n =s.length();
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(ch>='a'&&ch<='z') sb.append(ch);
            else if(ch=='(') st.push(ch);
            else if(ch==')'){
                while(!st.isEmpty()&&st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
            }else{
                while(!st.isEmpty()&&priority(st.peek())>priority(ch)) sb.append(st.pop());
                st.push(ch);
            }
        }
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }
    public static int priority(char ch){
        if(ch=='^') return 3;
        else if(ch=='*'||ch=='/') return 2;
        else if(ch=='+'||ch=='-') return 1;
        else return 0;
    }
}
