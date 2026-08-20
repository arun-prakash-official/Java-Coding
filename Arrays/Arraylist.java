import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        System.out.println(marks);
        marks.add(1, 15);
        marks.add(40);
        System.out.println(marks);
        marks.remove(2);
        System.out.println(marks);
        marks.set(1, 25);
        System.out.println(marks);
        System.out.println(marks.get(0));
        System.out.println(marks.size());
        System.out.println(marks.contains(30));
        System.out.println(marks.indexOf(40));
        System.out.println(marks.isEmpty());
        
    }
}