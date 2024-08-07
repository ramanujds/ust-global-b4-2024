package creationalpatterns.builder;

public class PizzaBuilderMain {

    public static void main(String[] args) {

        Pizza pizza1 = new PizzaBuilder("Medium").build();
        System.out.println(pizza1);

        Pizza pizza2 = new PizzaBuilder("Medium").mushrooms(true).cheese(true).build();
        System.out.println(pizza2);

        Pizza pizzz3 = new PizzaBuilder("Large").cheese(true).pepperoni(true).build();
        System.out.println(pizzz3);



    }

}
