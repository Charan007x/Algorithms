// TC - o(n), SC-o(1)
public static int fun(int n){
        if(n==1||n==2) return 1;
        int a=1,b=1;
        for(int i=3;i<=n;i++){
            int t=b;
            b=a+b;
            a=t;
        }
        return b;
    }
