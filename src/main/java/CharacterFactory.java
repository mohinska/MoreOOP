import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.reflections.Reflections;
import lotr.Character;

public class CharacterFactory {

    private static final Reflections reflections = new Reflections("lotr");

    private static final List<Class<? extends Character>> characters = new ArrayList<>(
            reflections.getSubTypesOf(Character.class));

    public static Character createCharacter() {
        try {
            Class<? extends Character> clazz = characters.get(new Random().nextInt(characters.size()));
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create character", e);
        }
    }
}