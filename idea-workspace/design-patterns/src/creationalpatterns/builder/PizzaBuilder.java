package creationalpatterns.builder;

public class PizzaBuilder {

    private String size;

    private boolean cheese=false;
    private boolean mushrooms=false;
    private boolean pepperoni=false;

    public PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder cheese(boolean value){
        this.cheese=value;
        return this;
    }

    public PizzaBuilder mushrooms(boolean value){
        this.mushrooms=value;
        return this;
    }

    public PizzaBuilder pepperoni(boolean value){
        this.pepperoni=value;
        return this;
    }

    public Pizza build(){
        Pizza pizza = new Pizza(this);
        return pizza;
    }

    public String getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }
}
