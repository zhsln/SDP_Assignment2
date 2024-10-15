package FlyweightPattern;

public class Character {
    private char symbol; // Внутреннее состояние (intrinsic)
    private String font;
    private int size;

    public Character(char symbol, String font, int size) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
    }

    public void render(int x, int y) { // Внешнее состояние (extrinsic)
        System.out.println("Rendering character '" + symbol + "' at (" + x + ", " + y + ") in font: " + font + ", size: " + size);
    }
}
