import java.util.Scanner;

public class VirusGrowth2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        sc.close();
        float inc_val=0.5f;
        for(int i=1;i<=days;i++){
            System.out.printf("%.1f ", inc_val);
            inc_val *= 4;
        }
    }
}
