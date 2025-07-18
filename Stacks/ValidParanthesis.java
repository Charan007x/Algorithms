import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(s.charAt(i)=='(') st.push('(');
            else if(s.charAt(i)=='[') st.push('[');
            else if(s.charAt(i)=='{') st.push('{');    
            else if((s.charAt(i)=='}')&&!st.isEmpty()&&st.peek()=='{') st.pop();
            else if((s.charAt(i)==']')&&!st.isEmpty()&&st.peek()=='[') st.pop();  
            else if((s.charAt(i)==')')&&!st.isEmpty()&&st.peek()=='(') st.pop();               
                else{
                    System.out.println("Invalid");
                return;
                }
        }
        if(!st.isEmpty()){
            System.out.println("Invalid");
        return;
        }
        System.out.println("Valid");
    }
}
