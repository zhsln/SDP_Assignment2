package CompositePattern;

public abstract class MenuComponent {
    // There are 3 methods with UnsupportedOperationException, because MenuItem cannot use these methods.
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract String getName();

    public abstract String getDescription();

    //Throws UnsupportedOperationException, because only MenuItem can have price, not the whole Menu...
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
