package DecoratorPattern;

public class VegetarianPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Vegetarian Pizza";
    }

    @Override
    public double getCost() {
        return 2500; // In KZT :D
    }
}