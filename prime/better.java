public static int better(int n){
         int count =0;
         for(int i=2;i<=n;i++){
             if(i>2&&i%2==0) continue;
             boolean flag = true;
             for(int j=2;j*j<=i;j++){
                 if(i%j==0){
                     flag = false;
                     break;
                 }
             }
             if(flag==true) count++;
         }
         return count;
     }
