public class Main {
    public static void main(String[] args) {
        PizzaBuilder pizzaHutLarge = new PizzaBuilder.Builder("Pizza Hut")
                .size(PizzaBuilder.Size.LARGE)
                .addTopping(PizzaBuilder.Topping.BACON)
                .addTopping(PizzaBuilder.Topping.TOMATO_AND_BASIL)
                .addTopping(PizzaBuilder.Topping.CHICKEN)
                .build();
        pizzaHutLarge.eat();

        PizzaBuilder pizzaHutSmall = new PizzaBuilder.Builder("Pizza Hut")
                .size(PizzaBuilder.Size.SMALL)
                .addTopping(PizzaBuilder.Topping.PEPPERONI)
                .addTopping(PizzaBuilder.Topping.EXTRA_CHEESE)
                .build();
        pizzaHutSmall.eat();

        PizzaBuilder littleCaesarsMedium = new PizzaBuilder.Builder("Little Caesar's")
                .size(PizzaBuilder.Size.MEDIUM)
                .addTopping(PizzaBuilder.Topping.SAUSAGE)
                .addTopping(PizzaBuilder.Topping.ONIONS)
                .addTopping(PizzaBuilder.Topping.OLIVES)
                .addTopping(PizzaBuilder.Topping.SPINACH)
                .addTopping(PizzaBuilder.Topping.MUSHROOMS)
                .addTopping(PizzaBuilder.Topping.EXTRA_CHEESE)
                .addTopping(PizzaBuilder.Topping.PEPPERS)
                .addTopping(PizzaBuilder.Topping.BEEF)
                .build();
        littleCaesarsMedium.eat();

        PizzaBuilder littleCaesarsSmall = new PizzaBuilder.Builder("Little Caesar's")
                .size(PizzaBuilder.Size.SMALL)
                .addTopping(PizzaBuilder.Topping.PEPPERS)
                .addTopping(PizzaBuilder.Topping.HAM)
                .addTopping(PizzaBuilder.Topping.CHICKEN)
                .addTopping(PizzaBuilder.Topping.PESTO)
                .addTopping(PizzaBuilder.Topping.SPICY_PORK)
                .addTopping(PizzaBuilder.Topping.EXTRA_CHEESE)
                .build();
        littleCaesarsSmall.eat();

        PizzaBuilder dominoesSmall = new PizzaBuilder.Builder("Dominoes")
                .size(PizzaBuilder.Size.SMALL)
                .addTopping(PizzaBuilder.Topping.HAM_AND_PINEAPPLE)
                .build();
        dominoesSmall.eat();

        PizzaBuilder dominoesLarge = new PizzaBuilder.Builder("Dominoes")
                .size(PizzaBuilder.Size.LARGE)
                .addTopping(PizzaBuilder.Topping.PEPPERONI)
                .addTopping(PizzaBuilder.Topping.EXTRA_CHEESE)
                .addTopping(PizzaBuilder.Topping.PESTO)
                .build();
        dominoesLarge.eat();
    }
}