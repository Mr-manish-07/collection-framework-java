package Practice.Comparable;

public class Student implements Comparable<Student>{

    String name;
    int id ;
    int rollNo;

    public Student(String name, int id, int rollNo) {
        this.name = name;
        this.id = id;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        return  this.id - o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", rollNo=" + rollNo +
                '}';
    }
}
