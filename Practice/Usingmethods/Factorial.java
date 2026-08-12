package Usingmethods;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
