public class Meal {
    private final Carbs carbs;
    private final Protein protein;
    private final Fats fats;

    public Meal(Carbs carbs, Protein protein, Fats fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    @Override
    public String toString() {
        return
                "    Carb: " + carbs.getName() +
                ", Protein: " + protein.getName() +
                ", Fat: " + fats.getName();
    }
}