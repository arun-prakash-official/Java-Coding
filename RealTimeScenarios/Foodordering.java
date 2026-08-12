package RealTimeScenarios;

import java.util.Scanner;

public class Foodordering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define menu items and prices
        String[] menu = {"Pizza", "Burger", "Fries", "Coke", "Ice Cream", "Sandwich", "Chicken", "Noodles"};
        double[] prices = {250, 150, 80, 50, 100, 120, 200, 120};
        
        // Arrays to store ordered items
        String[] orderedItems = new String[5];
        double[] orderedPrices = new double[5];
        int[] quantities = new int[5];
        
        double totalAmount = 0;
        
        System.out.println("=".repeat(50));
        System.out.println("          FOOD ORDERING SYSTEM");
        System.out.println("=".repeat(50));
        System.out.println("\nAvailable Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rs. " + prices[i]);
        }
        
        // Order 5 items
        System.out.println("\n" + "-".repeat(50));
        System.out.println("Order 5 items:");
        System.out.println("-".repeat(50));
        
        for (int i = 0; i < 5; i++) {
            System.out.print("\nItem " + (i + 1) + " - Enter item number (1-" + menu.length + "): ");
            int choice = sc.nextInt();
            
            if (choice < 1 || choice > menu.length) {
                System.out.println("Invalid choice! Please try again.");
                i--;
                continue;
            }
            
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            
            orderedItems[i] = menu[choice - 1];
            orderedPrices[i] = prices[choice - 1];
            quantities[i] = qty;
            totalAmount += orderedPrices[i] * quantities[i];
        }
        
        // Print Bill
        printBill(orderedItems, orderedPrices, quantities, totalAmount);
        
        sc.close();
    }
    
    public static void printBill(String[] items, double[] prices, int[] quantities, double total) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("               BILL");
        System.out.println("=".repeat(50));
        System.out.printf("%-20s %10s %10s %12s\n", "Item", "Price", "Qty", "Amount");
        System.out.println("-".repeat(50));
        
        double subtotal = 0;
        for (int i = 0; i < items.length; i++) {
            double amount = prices[i] * quantities[i];
            System.out.printf("%-20s Rs.%-7.2f %10d Rs.%-10.2f\n", items[i], prices[i], quantities[i], amount);
            subtotal += amount;
        }
        
        System.out.println("-".repeat(50));
        System.out.printf("%-20s %35s Rs.%-10.2f\n", "Subtotal:", "", subtotal);
        
        // Calculate tax (5%)
        double tax = subtotal * 0.05;
        System.out.printf("%-20s %35s Rs.%-10.2f\n", "Tax (5%):", "", tax);
        
        // Calculate discount (10%)
        double discount = subtotal * 0.10;
        System.out.printf("%-20s %35s Rs.%-10.2f\n", "Discount (10%):", "", discount);
        
        double finalAmount = subtotal + tax - discount;
        System.out.println("=".repeat(50));
        System.out.printf("%-20s %35s Rs.%-10.2f\n", "TOTAL:", "", finalAmount);
        System.out.println("=".repeat(50));
        System.out.println("\nThank you for your order!");
    }
}
