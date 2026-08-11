public class attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int days_attended=sc.nextInt();
        sc.close();
        System.out.println("Attendance Percentage: ");
        int percent=days_attended*100/180;
        System.out.println(percent);
    }
}
