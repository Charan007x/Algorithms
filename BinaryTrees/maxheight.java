// TC - O(n) and SC is O(n) worst case amd O(log(n)) in best case
// simply put it is the height of the tree
public static int maxheight(Node root){
        if(root==null) return -1;
        return 1+Math.max(maxheight(root.left),maxheight(root.right));
    }
