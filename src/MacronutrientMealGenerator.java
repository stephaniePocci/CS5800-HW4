import java.util.ArrayList;
import java.util.List;

// Driver program
public class MacronutrientMealGenerator {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Alice", DietPlan.NO_RESTRICTION));
        customers.add(new Customer("Bob", DietPlan.PALEO));
        customers.add(new Customer("Charlie", DietPlan.VEGAN));
        customers.add(new Customer("David", DietPlan.NUT_ALLERGY));
        customers.add(new Customer("Eve", DietPlan.NO_RESTRICTION));
        customers.add(new Customer("Frank", DietPlan.VEGAN));

        for (Customer customer : customers) {
            Meal meal = customer.getMeal();
            System.out.println(customer.getName() + "'s meal: \n" + meal);
        }
    }
}
