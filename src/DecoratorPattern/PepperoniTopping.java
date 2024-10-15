package DecoratorPattern;

public class PepperoniTopping extends ToppingDecorator {

    public PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 250;
    }
}