// SIEVE OF ERATOSTHENES
public static int optimal(int n){
         int count =0;
         boolean prime[] = new boolean[n+1];
         Arrays.fill(prime,true);
         prime[0]=false;
         prime[1]=false;
         for(int p=2;p*p<=n;p++){
             if(prime[p]){
                 for(int i=p*p;i<=n;i+=p){
                    prime[i]=false;
                 }
             }
         }
         for(boolean x:prime){
             if(x) count++;
         }
         return count;
     }
