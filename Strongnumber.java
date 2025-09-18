import java.util.Scanner;

public class Strongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int original = n;
        int sum = 0;
        while (n > 0) {
            n= n % 10;
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if (sum == original) {
            System.out.println("Rare Item");
        } else {
            System.out.println("Common Item");
        }
    }
}