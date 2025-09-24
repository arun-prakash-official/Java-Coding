package Patterns;

import java.util.Scanner;

public class RightTriangle2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        int num=n*(n+1)/2;
        for(int i=n;i>=1;i--){
            for (int j=1;j<i;j++){
                System.out.print(num+"*");
                num--;
            }
            System.out.print(num--);
            System.out.println();
        }
    }
}
