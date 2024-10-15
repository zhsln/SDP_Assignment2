package FlyweightPattern;

public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        TextEditor textEditor = new TextEditor(characterFactory);

        // Добавляем символы
        textEditor.addCharacter('Z', "Arial", 12, 10, 10);
        textEditor.addCharacter('h', "Arial", 12, 20, 10);
        textEditor.addCharacter('a', "Arial", 12, 30, 10);
        textEditor.addCharacter('s', "Arial", 12, 40, 20);
        textEditor.addCharacter('u', "Arial", 12, 50, 20);
        textEditor.addCharacter('l', "Arial", 14, 10, 30);
        textEditor.addCharacter('a', "Arial", 14, 20, 30);
        textEditor.addCharacter('n', "Arial", 14, 30, 30);

        // Рендерим текст
        textEditor.renderText();
    }
}
