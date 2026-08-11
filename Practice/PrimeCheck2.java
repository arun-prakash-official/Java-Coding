import java.util.Scanner;
public class PrimeCheck2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean result = primeornot(n);
        if(result)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
    public static boolean primeornot( int n) {
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
