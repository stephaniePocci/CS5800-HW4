import java.util.List;
import java.util.Random;

// abstract factory
public interface MacronutrientFactory {
    Carbs createCarbs();
    Protein createProtein();
    Fats createFats();
}

// concrete factories
class NoRestrictionFactory implements MacronutrientFactory {
    private static final List<Carbs> CARBS_OPTIONS = List.of(new Bread(), new Lentils(), new Pistachio(), new Cheese());
    private static final List<Protein> PROTEIN_OPTIONS = List.of(new Fish(), new Chicken(), new Beef(), new Tofu());
    private static final List<Fats> FATS_OPTIONS = List.of(new Avocado(), new SourCream(), new Peanuts(), new Tuna());

    private static final Random RANDOM = new Random();

    @Override
    public Carbs createCarbs() {
        return CARBS_OPTIONS.get(RANDOM.nextInt(CARBS_OPTIONS.size()));
    }

    @Override
    public Protein createProtein() {
        return PROTEIN_OPTIONS.get(RANDOM.nextInt(PROTEIN_OPTIONS.size()));
    }

    @Override
    public Fats createFats() {
        return FATS_OPTIONS.get(RANDOM.nextInt(FATS_OPTIONS.size()));
    }
}

class PaleoFactory implements MacronutrientFactory {
    private static final List<Carbs> CARBS_OPTIONS = List.of(new Pistachio());
    private static final List<Protein> PROTEIN_OPTIONS = List.of(new Fish(), new Chicken(), new Beef());
    private static final List<Fats> FATS_OPTIONS = List.of(new Avocado(), new Tuna());

    private static final Random RANDOM = new Random();

    @Override
    public Carbs createCarbs() {
        return CARBS_OPTIONS.get(RANDOM.nextInt(CARBS_OPTIONS.size()));
    }

    @Override
    public Protein createProtein() {
        return PROTEIN_OPTIONS.get(RANDOM.nextInt(PROTEIN_OPTIONS.size()));
    }

    @Override
    public Fats createFats() {
        return FATS_OPTIONS.get(RANDOM.nextInt(FATS_OPTIONS.size()));
    }
}

class VeganFactory implements MacronutrientFactory {
    private static final List<Carbs> CARBS_OPTIONS = List.of(new Bread(), new Lentils(), new Pistachio());
    private static final List<Protein> PROTEIN_OPTIONS = List.of(new Tofu());
    private static final List<Fats> FATS_OPTIONS = List.of(new Avocado(), new Peanuts());

    private static final Random RANDOM = new Random();

    @Override
    public Carbs createCarbs() {
        return CARBS_OPTIONS.get(RANDOM.nextInt(CARBS_OPTIONS.size()));
    }

    @Override
    public Protein createProtein() {
        return PROTEIN_OPTIONS.get(RANDOM.nextInt(PROTEIN_OPTIONS.size()));
    }

    @Override
    public Fats createFats() {
        return FATS_OPTIONS.get(RANDOM.nextInt(FATS_OPTIONS.size()));
    }
}

class NutAllergyFactory implements MacronutrientFactory {
    private static final List<Carbs> CARBS_OPTIONS = List.of(new Bread(), new Lentils(), new Cheese());
    private static final List<Protein> PROTEIN_OPTIONS = List.of(new Fish(), new Chicken(), new Beef(), new Tofu());
    private static final List<Fats> FATS_OPTIONS = List.of(new Avocado(), new SourCream(), new Tuna());

    private static final Random RANDOM = new Random();

    @Override
    public Carbs createCarbs() {
        return CARBS_OPTIONS.get(RANDOM.nextInt(CARBS_OPTIONS.size()));
    }

    @Override
    public Protein createProtein() {
        return PROTEIN_OPTIONS.get(RANDOM.nextInt(PROTEIN_OPTIONS.size()));
    }

    @Override
    public Fats createFats() {
        return FATS_OPTIONS.get(RANDOM.nextInt(FATS_OPTIONS.size()));
    }
}