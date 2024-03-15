// Singleton Abstract Factory
public class MacronutrientAbstractFactory {
    private static MacronutrientAbstractFactory instance;

    private final MacronutrientFactory noRestrictionFactory;
    private final MacronutrientFactory paleoFactory;
    private final MacronutrientFactory veganFactory;
    private final MacronutrientFactory nutAllergyFactory;

    private MacronutrientAbstractFactory() {
        noRestrictionFactory = new NoRestrictionFactory();
        paleoFactory = new PaleoFactory();
        veganFactory = new VeganFactory();
        nutAllergyFactory = new NutAllergyFactory();
    }

    public static MacronutrientAbstractFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientAbstractFactory();
        }
        return instance;
    }

    public MacronutrientFactory getFactory(DietPlan dietPlan) {
        switch (dietPlan) {
            case NO_RESTRICTION:
                return noRestrictionFactory;
            case PALEO:
                return paleoFactory;
            case VEGAN:
                return veganFactory;
            case NUT_ALLERGY:
                return nutAllergyFactory;
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }
}