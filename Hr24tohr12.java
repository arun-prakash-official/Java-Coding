import java.util.Scanner;
public class Hr24tohr12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y=sc.nextInt();
        int product=x*y;
        int time=(product==12)?12:product%12;
        System.out.print(time);
        sc.close();
    }
}
