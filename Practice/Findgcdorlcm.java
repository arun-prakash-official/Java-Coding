import java.util.Scanner;
public class Findgcdorlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate GCD
        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        // Calculate LCM
        int lcm = findLCM(num1, num2, gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }

    private static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int findLCM(int a, int b, int gcd) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a / gcd * b);
    }
}
