package Practice6.Ex4;

public class Computer implements Priceable {
    private int price;

    public Computer(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
