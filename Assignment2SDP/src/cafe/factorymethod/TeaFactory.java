package cafe.factorymethod;

import cafe.product.Drink;
import cafe.product.Tea;

public class TeaFactory implements DrinkFactory{
    public Drink createDrink() {
        return new Tea();
    }
}
