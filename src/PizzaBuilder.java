import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements Pizza {
    private String pizza_chain;
    private Size size;
    private List<Topping> toppings;

    public static class Builder {
        private final String chain;
        private Size size;
        private final List<Topping> toppings = new ArrayList<>();

        public Builder(String pizza_chain) {
            this.chain = pizza_chain;
        }

        public Builder size(Size size) {
            this.size = size;
            return this;
        }

        public Builder addTopping(Topping topping) {
            toppings.add(topping);
            return this;
        }

        public PizzaBuilder build() {
            PizzaBuilder pizza = new PizzaBuilder();
            pizza.pizza_chain = this.chain;
            pizza.size = this.size;
            pizza.toppings = this.toppings;
            return pizza;
        }
    }

    @Override
    public void eat() {
        System.out.println("Pizza Chain: " + pizza_chain + "\nSize: " + size + "\nToppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping);
        }
        System.out.println("\n");
    }

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public enum Topping {
        PEPPERONI, SAUSAGE, MUSHROOMS, BACON, ONIONS, EXTRA_CHEESE, PEPPERS, CHICKEN, OLIVES, SPINACH, TOMATO_AND_BASIL, BEEF, HAM, PESTO, SPICY_PORK, HAM_AND_PINEAPPLE
    }
}
