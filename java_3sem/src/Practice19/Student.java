package Practice19;

public class Student {
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int score;

    public Student() {
        this.id = 100000 + (int)(Math.random()*100000);;
        this.score = (int)(Math.random()*120);
    }
    public Student(int score, String name) {
        this.id = 100000 + (int)(Math.random()*100000);
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
