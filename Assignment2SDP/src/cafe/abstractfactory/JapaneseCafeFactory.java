package cafe.abstractfactory;

import cafe.product.*;

public class JapaneseCafeFactory implements CafeFactory{
    public Drink createDrink(){
        return new Tea();
    }
    public Dessert createDessert(){
        return new Mochi();
    }
}
