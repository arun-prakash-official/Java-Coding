import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int t = sc.nextInt();

        if (t >= 20 && t <= 30) {
            System.out.println("Safe for outside");
        } else {
            System.out.println("Too Cold");
        }

        sc.close();
    }
}

