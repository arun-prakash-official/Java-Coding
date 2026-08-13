import java.util.*;

class Student {
    String name;
    int rollno;
    int mark;
    public Student(String name, int rollno, int mark) {
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
    }
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollno;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(int rollno) {
        this.rollno = rollno;
    }
    public int getMarks() {
        return mark;
    }
    public void setMarks(int mark) {
        this.mark = mark;
    }
    void displayDetails(){
        System.out.println("Name: " + name + ", Roll No: " + rollno + ", Marks: " + mark);
    }
    boolean isPassed(){
        if(mark>=40){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll no: ");
            int rollno = sc.nextInt();
            System.out.print("Enter marks: ");
            int mark = sc.nextInt();
            sc.nextLine(); 
            
            students[i] = new Student(name, rollno, mark);
        }
        System.out.println("\n---------Student Details----------");
        for(Student student : students) {
            student.displayDetails();
            if(student.isPassed()) {
                System.out.println(student.getName() + " has passed the exam.");
            } else {
                System.out.println(student.getName() + " has failed the exam.");
            }
        }
        sc.close();
    }
}