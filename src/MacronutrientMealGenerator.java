import java.util.ArrayList;
import java.util.List;

public class MacronutrientMealGenerator {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Stephanie", DietPlan.NO_RESTRICTION));
        customers.add(new Customer("Alan", DietPlan.PALEO));
        customers.add(new Customer("Robert", DietPlan.VEGAN));
        customers.add(new Customer("Davarpanah", DietPlan.NUT_ALLERGY));
        customers.add(new Customer("Jennifer", DietPlan.NO_RESTRICTION));
        customers.add(new Customer("Raquel", DietPlan.VEGAN));

        for (Customer customer : customers) {
            Meal meal = customer.getMeal();
            System.out.println(customer.getName() + "'s diet plan: \n" + meal);
        }
    }
}
