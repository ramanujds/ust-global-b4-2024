package creationalpatterns.builder;

public class Pizza {

    private String size;

    private boolean cheese;
    private boolean mushrooms;
    private boolean pepperoni;

    public Pizza(PizzaBuilder pizzaBuilder){
        this.size=pizzaBuilder.getSize();
        this.mushrooms=pizzaBuilder.isMushrooms();
        this.cheese=pizzaBuilder.isCheese();
        this.pepperoni=pizzaBuilder.isPepperoni();
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("size='").append(size).append('\'');
        sb.append(", cheese=").append(cheese);
        sb.append(", mushrooms=").append(mushrooms);
        sb.append(", pepperoni=").append(pepperoni);
        sb.append('}');
        return sb.toString();
    }
}
