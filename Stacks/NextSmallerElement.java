import java.util.*;
public class New{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int nse[]=new int[n];
        Arrays.fill(nse,-1);
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()>=a[i]) st.pop();
            if(!st.isEmpty()) nse[i]=st.peek();
                st.push(a[i]);
        }
        for(int x:nse) System.out.print(x+" ");
    }
}
