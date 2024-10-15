package DecoratorPattern;

public class MargheritaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Margheritta Pizza";
    }

    @Override
    public double getCost() {
        return 3000; // In KZT, of course :D
    }
}
