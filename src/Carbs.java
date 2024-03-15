public interface Carbs {
    String getName();
}

class Bread implements Carbs {
    @Override
    public String getName() {
        return "Bread";
    }
}

class Lentils implements Carbs {
    @Override
    public String getName() {
        return "Lentils";
    }
}

class Pistachio implements Carbs {
    @Override
    public String getName() {
        return "Pistachio";
    }
}

class Cheese implements Carbs {
    @Override
    public String getName() { return "Cheese"; }
}