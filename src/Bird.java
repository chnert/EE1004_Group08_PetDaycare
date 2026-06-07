public class Bird extends Pet {
    private static final int GRAMS_PER_MEAL = 20;
    private static final int MEALS_PER_DAY = 4;

    public Bird(String name, int age, String ownerName) {
        super(name, age, ownerName, GRAMS_PER_MEAL, MEALS_PER_DAY);
    }

    @Override
    public String getCareInstructions() {
        return "Clean cage";
    }

    @Override
    public String toString() {
        return getBaseInfo() + "\n" + (isFedToday ? "Fed Today" : "Not Fed");
    }
}