// InOrder Traversal
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
    public static void display(Node root){
        if(root==null) return;
        display(root.left);
        System.out.println(root.val);
        display(root.right);
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
        display(root);
    }
}
