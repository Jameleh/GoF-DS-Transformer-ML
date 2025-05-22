import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Character, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(char key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new CharacterFlyweight(key));
        }
        return flyweights.get(key);
    }
}
