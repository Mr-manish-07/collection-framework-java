package Practice.Comparable;

import java.util.ArrayList;
import java.util.List;

public class Comparable_Demo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Manish", 100, 102));
        students.add(new Student("Manish", 10, 103));
        students.add(new Student("Manish", 150, 172));
        students.add(new Student("Manish", 80, 105));

        System.out.println(students);

        students.sort(null);

        System.out.println(students);

    }
}
