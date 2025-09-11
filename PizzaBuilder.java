public class PizzaBuilder {
    public static void main(String[] args){
        Pizza pizza1 = new Pizza.PizzaBuilder("Large")
                .crust("Thin")
                .cheese(true)
                .pepperoni(true)
                .build();
        Pizza pizza2 = new Pizza.PizzaBuilder("Medium")
                .crust("Stuffed")
                .mushroom(true)
                .build();
        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}