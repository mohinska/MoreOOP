import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.SneakyThrows;
import org.reflections.Reflections;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Reflections reflections = new Reflections("");
        List<Class<? extends Character>> characters = new ArrayList<>(reflections.getSubTypesOf(Character.class));
        return characters.get(new Random().nextInt(characters.size())).getDeclaredConstructor().newInstance();
    }
}
