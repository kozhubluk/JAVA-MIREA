package Practice9.Task4;

public class Student implements Comparable<Student> {
    private int id;
    private int score;

    public Student() {
        this.id = 100000 + (int)(Math.random()*100000);;
        this.score = (int)(Math.random()*120);
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                "}\n";
    }
}