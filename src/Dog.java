public class Dog extends Pet {
    private static final int GRAMS_PER_MEAL = 250;
    private static final int MEALS_PER_DAY = 2;

    public Dog(String name, int age, String ownerName) {
        super(name, age, ownerName, GRAMS_PER_MEAL, MEALS_PER_DAY);
    }

    @Override
    public String getCareInstructions() {
        return "Walk twice daily";
    }

    @Override
    public String toString() {
        return getBaseInfo() + "\n" + (isFedToday ? "Fed Today" : "Not Fed");
    }
}