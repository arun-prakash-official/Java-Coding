import java.util.*;
public class AreaPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        sc.close();
    }
}
