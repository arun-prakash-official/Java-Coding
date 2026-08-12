import java.util.Scanner;
public class Studentdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your marks " + name);
        int marks[]=new int[5];
        for (int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        for (int mark:marks){
            System.out.println(mark);
        }
        sc.close();
    }
}