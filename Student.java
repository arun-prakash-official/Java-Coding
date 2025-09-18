import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = ip.nextLine();
        System.out.print("Enter age: ");
        int age = ip.nextInt();
        System.out.print("Enter CGPA: ");
        double cgpa = ip.nextDouble();
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        ip.close();
    }
}