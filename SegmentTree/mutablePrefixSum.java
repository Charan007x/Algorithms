import java.util.*;
public class segment {
    int n;
    int tree[];
    segment(int a[]){
        n=a.length;
        tree=new int[4*n];
        build(0,0,n-1,a);
    }
    public void build(int node,int start,int end,int a[]){
        if(start==end){ // base case
            tree[node]=a[start];
            return;
        }
        int mid=(start+end)/2;
        build(2*node+1,start,mid,a); // build left subtree
        build(2*node+2,mid+1,end,a); // build right subtree
        tree[node]=tree[2*node+1]+tree[2*node+2];
    }
    public int query(int left,int right){
        return query(0,0,n-1,left,right);
    }
    public int query(int node,int start,int end,int left,int right){
        if(end<left||start>right) return 0; // no overlap
        if(left<=start&&end<=right){
            return tree[node];
        }
        int mid=(start+end)/2; // partial overlap
        int leftSum=query(2*node+1,start,mid,left,right);
        int rightSum=query(2*node+2,mid+1,end,left,right);
        return leftSum+rightSum;
    }
    public void update(int index,int value){
        update(0,0,n-1,index,value);
    }
    public void update(int node,int start,int end,int index,int value){
        if(start==end){
            tree[node]=value;
            return;
        }
        int mid=(start+end)/2;
        if(index<=mid) update(2*node+1,start,mid,index,value); // only update left subtree
        else update(2*node+2,mid+1,end,index,value); // only update right subtree
        tree[node]=tree[2*node+1]+tree[2*node+2]; // recompute current node value
    }
    public static void main(String[] args){
        int a[]={1,2,3,4};
        segment s=new segment(a);
        s.update(1,5);
        System.out.println(s.query(1,1));
    }
}
