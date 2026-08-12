package RealTimeScenarios;
import java.util.Scanner;
public class Checkbenefits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Balance: ");
        int bal=sc.nextInt();
        sc.close();
        boolean isPremium=isPremium(bal);
        System.out.println(isPremium?"You are a Premium Member":"You are a Regular Member");
    }
    static boolean isPremium(int balance){
        return balance>=10000;
    }
}
