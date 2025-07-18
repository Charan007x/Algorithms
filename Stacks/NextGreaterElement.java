import java.util.*;
public class New{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int nge[]=new int[n];
        nge[n-1]=-1;
        st.push(a[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=a[i]) st.pop();
            if(!st.isEmpty()&&st.peek()>a[i]){
                nge[i]=st.peek();
                st.push(a[i]);
            }else if(st.isEmpty()){
                nge[i]=-1;
                st.push(a[i]);
            }
        }
        for(int x:nge) System.out.print(x+" ");
    }
}
