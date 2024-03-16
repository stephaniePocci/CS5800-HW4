public class Customer {
    private final String name;
    private final DietPlan dietPlan;

    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public Meal getMeal() {
        MacronutrientFactory factory = MacronutrientAbstractFactory.getInstance().getFactory(dietPlan);
        Carbs carbs = factory.createCarbs();
        Protein protein = factory.createProtein();
        Fats fats = factory.createFats();
        return new Meal(carbs, protein, fats);
    }
}