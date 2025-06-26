import java.util.*;
public class New{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count=0;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') flag = true;
                if(flag==true) count++;
            }
        }
        System.out.println(count);
    }
}
