package Practice31;

import Practice29.Dish;
import Practice29.Drink;
import Practice29.InternetOrder;
import Practice29.Item;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

class InternetOrderTest {
    @Test
    public void sorting_test(){
        Dish dish1 = new Dish(4, "Шашлык", "Описание1");
        Dish dish2 = new Dish(3, "Оливье", "Описание2");
        Drink drink1 = new Drink(5, "Вино красное", "Описание3");
        Item[] arr1 = {dish1, drink1, dish2};
        InternetOrder internetOrder = new InternetOrder(arr1);
        Item[] sortred = internetOrder.sort();
        Item[] expected = {drink1, dish1, dish2};
        Assert.assertEquals(sortred,expected);
    }
}