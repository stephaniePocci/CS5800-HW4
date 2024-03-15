public interface Fats { //abstract
    String getName();
}

class Avocado implements Fats { //concrete
    @Override
    public String getName() {
        return "Avocado";
    }
}

class SourCream implements Fats {
    @Override
    public String getName() {
        return "Sour Cream";
    }
}

class Peanuts implements Fats {
    @Override
    public String getName() {
        return "Peanuts";
    }
}