import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        sc.close();
        String[] suggestions = new String[]{"Arun", "Vennila", "Chocolate","Cake","Ice Cream","Pasta","Pizza","Burger"};
        if(username.equals("admin") && password.equals("admin123")) {
            System.out.println("Welcome " + username);
            System.out.println("Follow Suggestions:");
            for (String suggestion : suggestions) {
                System.out.println(suggestion+ " ".repeat(20-suggestion.length()) +"ADD");
            }
        } else {
            System.out.println("Login Failed");
        }
    }
}
