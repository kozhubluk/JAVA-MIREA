package Practice9;

public class Student {
    private int id;
    private int score;

    public Student() {
        this.id = 100000 + (int)(Math.random()*100000);;
        this.score = (int)(Math.random()*120);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '\'' +
                ", score=" + score +
                '}';
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
}
