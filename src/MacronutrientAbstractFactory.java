// singleton
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
        return switch (dietPlan) {
            case NO_RESTRICTION -> noRestrictionFactory;
            case PALEO -> paleoFactory;
            case VEGAN -> veganFactory;
            case NUT_ALLERGY -> nutAllergyFactory;
        };
    }
}