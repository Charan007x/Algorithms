import java.util.*;
public class New{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int nse[]=new int[n];
        int pse[]= new int[n];
        for(int i=0;i<n;i++){ // pse cal
            while(!st1.isEmpty()&&a[i]<=a[st1.peek()]) st1.pop();
            if(!st1.isEmpty()&&a[i]>a[st1.peek()]){
                pse[i]=st1.peek();
            }
            else if(st1.isEmpty()){
                pse[i]=-1;
            }
            st1.push(i);
        }
        for(int i=n-1;i>=0;i--){ // nse
            while(!st2.isEmpty()&&a[i]<=a[st2.peek()]) st2.pop();
            if(!st2.isEmpty()&&a[i]>a[st2.peek()]){
                nse[i]=st2.peek();
            }
            else if(st2.isEmpty()){
                nse[i]=n;
            }
            st2.push(i);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           int curr=(nse[i]-pse[i]-1)*a[i];
            if(max<curr) max=curr;            
        }
        System.out.println(max);
    }
}
