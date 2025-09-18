package cafe.client;

import cafe.factorymethod.*;
import cafe.abstractfactory.*;
import cafe.product.*;

public class Client {
    public static void main(String[] args) {
        //factory method
        DrinkFactory teaFactory = new TeaFactory();
        Drink tea = teaFactory.createDrink();
        tea.serve();

        DrinkFactory coffeeFactory = new CoffeeFactory();
        Drink coffee = coffeeFactory.createDrink();
        coffee.serve();

        //abstract factory
        CafeFactory italianCafe = new ItalianCafeFactory();
        Drink italianDrink = italianCafe.createDrink();
        Dessert italianDessert = italianCafe.createDessert();
        italianDrink.serve();
        italianDessert.eat();

        CafeFactory japaneseCafe = new JapaneseCafeFactory();
        Drink japaneseDrink = japaneseCafe.createDrink();
        Dessert japaneseDessert = japaneseCafe.createDessert();
        japaneseDrink.serve();
        japaneseDessert.eat();
    }
}
