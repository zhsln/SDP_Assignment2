package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Character> characterPool = new HashMap<>();

    public Character getCharacter(char symbol, String font, int size) {
        String key = symbol + font + size;
        if (!characterPool.containsKey(key)) {
            characterPool.put(key, new Character(symbol, font, size));
            System.out.println("Creating new character: '" + symbol + "' in font: " + font + ", size: " + size);
        }
        return characterPool.get(key);
    }
}