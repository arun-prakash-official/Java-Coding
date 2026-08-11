package Usingmethods;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Addition: "+add(a,b));
        System.out.println("Subtraction: "+sub(a,b));
        System.out.println("Multiplication: "+mul(a,b));
        System.out.println("Division: "+div(a,b));
        System.out.println("Modulus: "+mod(a,b));
    }
    public static int add(int a, int b) {
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static double div(int a, int b){
        return (double)a/b;
    }
    public static int mod(int a, int b){
        return a%b;
    }
}
