package cafe.abstractfactory;
import cafe.product.*;

public class ItalianCafeFactory implements CafeFactory{
    public Drink createDrink(){
        return new Coffee();
    }
    public Dessert createDessert(){
        return new Tiramisu();
    }
}
