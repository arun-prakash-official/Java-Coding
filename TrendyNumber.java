import java.util.Scanner;

public class TrendyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 100 && n <= 999) {
            int mid = (n / 10) % 10;  // middle digit
            if (mid % 3 == 0) {
                System.out.println("Trendy Number");
            } else {
                System.out.println("Non-Trendy Number");
            }
        } else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}
