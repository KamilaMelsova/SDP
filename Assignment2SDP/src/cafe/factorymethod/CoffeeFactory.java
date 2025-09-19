package cafe.factorymethod;
import cafe.product.Drink;
import cafe.product.Coffee;

public class CoffeeFactory implements DrinkFactory{
    @Override
    public Drink createDrink(){
        return new Coffee();
    }
}
