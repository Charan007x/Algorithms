// TC is O(n) and SC is O(h)
public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
