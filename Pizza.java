public class Pizza {
    private String size;
    private String crust;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushroom;

    private Pizza(PizzaBuilder builder){
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushroom = builder.mushroom;
    }
    @Override
    public String toString(){
        return "Pizza [size=" + size
                + ", crust=" + crust
                + ", cheese=" + cheese
                + ", pepperoni=" + pepperoni
                + ", mushroom=" + mushroom + "]";
    }
    public static class PizzaBuilder {
        private String size;
        private String crust;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushroom;

        public PizzaBuilder(String size){
            this.size = size;
        }
        public PizzaBuilder crust(String crust){
            this.crust = crust;
            return this;
        }
        public PizzaBuilder cheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }
        public PizzaBuilder pepperoni(boolean pepperoni){
            this.pepperoni = pepperoni;
            return this;
        }
        public PizzaBuilder mushroom(boolean mushroom){
            this.mushroom = mushroom;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
}
