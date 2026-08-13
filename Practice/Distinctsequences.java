import java.util.*;
class Distinctsequences {
    static long modPow(long a,long e,int mod){
        long r=1;while(e>0){if((e&1)==1)r=r*a%mod;a=a*a%mod;e>>=1;}return r;
    }
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt(),mod=1_000_000_007;
        for(int i=0;i<n;i++) sc.nextInt(); sc.close();
        long[] fac=new long[n+1],ifac=new long[n+1];fac[0]=1;
        for(int i=1;i<=n;i++) fac[i]=fac[i-1]*i%mod;
        ifac[n]=modPow(fac[n],mod-2,mod);
        for(int i=n;i>0;i--) ifac[i-1]=ifac[i]*i%mod;
        long ans=0;
        for(int k=0;k<=n;k++) if(k<=x&&(x-k)%2==0)
            ans=(ans+fac[n]*ifac[k]%mod*ifac[n-k]%mod)%mod;
        System.out.println(ans);
    }
}
