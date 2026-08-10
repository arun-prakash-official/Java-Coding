import java.util.Scanner;
public class Gcdnlcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int x=a;int y=b;
        while (y!=0) {
            int t=y;
            y=x%y;
            x=t;
        }
        System.out.println("GCD="+ x);
        System.out.println("LCM="+ (a*b)/x);
    }
}
