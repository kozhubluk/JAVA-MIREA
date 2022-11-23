package Practice20.Ex3;

public class GuineaPig extends Animal{
    private int weight;

    public GuineaPig(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "GuineaPig{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
