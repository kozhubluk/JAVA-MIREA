package Practice31;

import Practice29.Dish;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

class DishTest {
    @Test
    public void test2(){
        try {
            Dish dish1 = new Dish(-3, "Борщ", "Описание1");
            Assert.fail("Expected exception");
        } catch (IllegalArgumentException e) {
            Assert.assertNotEquals("", e.getMessage());
        }
    }

}