package Practice30;

import java.io.Serializable;

public class Dish extends MenuItem implements Serializable {
    public Dish(int cost, String name, String description) {
        super(cost, name, description);
    }
}