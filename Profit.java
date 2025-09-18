import java.util.*;
public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no.of copies: ");
        int copies = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sellingPrice = sc.nextInt();
        System.out.print("Enter cost price: ");
        int costPrice = sc.nextInt();
        int profit = ((sellingPrice*copies) - (costPrice*copies));
        System.out.println("Profit: " + profit);
        sc.close();
    }
}
