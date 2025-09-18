import java.util.Scanner;
public class Mintosec {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter time in minutes: ");
       int minutes = sc.nextInt();
       int seconds = minutes * 60;
       System.out.println("Time in seconds: " + seconds);
       sc.close();
   }
}
