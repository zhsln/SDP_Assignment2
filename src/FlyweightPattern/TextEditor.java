package FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<CharacterPosition> characterPositions = new ArrayList<>();
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    public void addCharacter(char symbol, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(symbol, font, size);
        characterPositions.add(new CharacterPosition(character, x, y));
    }

    public void renderText() {
        for (CharacterPosition position : characterPositions) {
            position.render();
        }
    }
}

