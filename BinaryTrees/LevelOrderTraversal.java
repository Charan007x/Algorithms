// Level Order Traversal
import java.util.*;
public class lfg{
    public static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void display(Node root,int n){
        if(root==null) return;
        if(n==1) System.out.print(root.val+" ");
        display(root.left,n-1);  
        display(root.right,n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
        int x = height(root);
        for(int i=1;i<=x;i++){
            display(root,i);
            System.out.println();
        }
    }
}
