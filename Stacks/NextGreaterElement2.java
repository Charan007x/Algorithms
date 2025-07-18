//next greater two
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int nge[]=new int[n];
        for(int i=2*n-1;i>=0;i--){
            int idx=i%n;
            while(!st.isEmpty()&&st.peek()<=a[idx]) st.pop();
            if(i<n){
            if(!st.isEmpty()&&st.peek()>a[idx]){
                nge[idx]=st.peek();
            }else if(st.isEmpty()){
                nge[idx]=-1;
            }
            }
            st.push(a[idx]);
        }
        for(int x:nge) System.out.print(x+" ");
    }
}
