import java.util.*;
public class New{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int pse[]= new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&a[i]<=st.peek()) st.pop();
            if(!st.isEmpty()&&st.peek()<a[i]){
                pse[i]=st.peek();
                st.push(a[i]);
            }else if(st.isEmpty()){
                pse[i]=-1;
                st.push(a[i]);
            }
        }
        for(int x:pse) System.out.print(x+" ");
    }
}
