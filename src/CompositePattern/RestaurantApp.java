package CompositePattern;

public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Kazakh Breakfast");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Kazakh Lunch");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Kazakh Dinner");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        // Kazakh breakfast items
        breakfastMenu.add(new MenuItem("Baursak", "Traditional fried bread", 500));
        breakfastMenu.add(new MenuItem("Kurt", "Dried cheese balls", 300));

        // Kazakh lunch items
        lunchMenu.add(new MenuItem("Beshbarmak", "Boiled meat with noodles", 2500));
        lunchMenu.add(new MenuItem("Kazy", "Horse meat sausage", 2000));

        // Kazakh dinner items
        dinnerMenu.add(new MenuItem("Shashlyk", "Grilled meat skewers", 1500));
        dinnerMenu.add(new MenuItem("Lagman", "Noodles with vegetables and meat", 1800));

        allMenus.print();
    }
}
