import lotr.Character;

public class Demo {
    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();

        GameManager manager = new GameManager();
        manager.fight(c1, c2);
    }
}