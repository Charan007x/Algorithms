import java.util.*;
public class New{
    public static void main(String[]args){
        Stack<Integer> st = new Stack<>();
        int a[]={1,3,2,4};
        int n=a.length;
        int pse[]=new int[n];
        Arrays.fill(pse,-1);
        for(int i=0;i<n;i++){
            while(st.size()>0&&st.peek()>=a[i]) st.pop();
            if(st.size()>0) pse[i]=st.peek();
            st.push(a[i]);
        }
        for(int x:pse) System.out.print(x+" ");
        System.out.println();
    }
}
