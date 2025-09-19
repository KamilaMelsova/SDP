package cafe.abstractfactory;
import cafe.product.Drink;
import cafe.product.Dessert;

public interface CafeFactory{
    Drink createDrink();
    Dessert createDessert();
}
