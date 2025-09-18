import java.util.Scanner;

public class RentCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rate1: ");
        int R1 = sc.nextInt();
        System.out.print("Enter Free Hours: ");
        int f_hours = sc.nextInt();
        System.out.print("Enter Rate2 (for remaining hours): ");
        int R2 = sc.nextInt();
        System.out.print("Enter Total minutes: ");
        int x_min = sc.nextInt();
        int x_hours = (x_min % 60 == 0) ? (x_min / 60) : (x_min / 60 + 1);
        if (x_hours <= f_hours) {
            System.out.println("Total Cost = " + (x_hours * R1));
        } else {
            int rem_hours = x_hours - f_hours;
            int total_cost = (f_hours * R1) + (rem_hours * R2);
            System.out.println("Total Cost = " + total_cost);
        }
        sc.close();
    }
}
