public int gcd(int x,int y){
  int ans=1;
  for(int i=1;i<=Math.min(x,y);i++){
    if(x%i==0&&y%i==0) ans=i; 
  }
  return ans;
}
