package DecoratorPattern;

public class MushroomTopping extends ToppingDecorator {

    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Mushrooms";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 200;
    }
}