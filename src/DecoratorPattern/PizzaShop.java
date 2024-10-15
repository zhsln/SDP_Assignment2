package DecoratorPattern;

public class PizzaShop {
    public static void main(String[] args) {
        // Pizza base
        Pizza margherita = new MargheritaPizza();
        System.out.println(margherita.getDescription() + " Cost: " + margherita.getCost() + " KZT");

        // Toppings
        Pizza margheritaWithCheese = new CheeseTopping(margherita);
        System.out.println(margheritaWithCheese.getDescription() + " Cost: " + margheritaWithCheese.getCost() + " KZT");

        Pizza margheritaWithCheeseAndMushrooms = new MushroomTopping(margheritaWithCheese);
        System.out.println(margheritaWithCheeseAndMushrooms.getDescription() + " Cost: " + margheritaWithCheeseAndMushrooms.getCost() + " KZT");

        // Another Pizza and 1 topping
        Pizza vegetarian = new VegetarianPizza();
        Pizza vegetarianWithPepperoni = new PepperoniTopping(vegetarian);
        System.out.println(vegetarianWithPepperoni.getDescription() + " Cost: " + vegetarianWithPepperoni.getCost() + " KZT");
    }
}
