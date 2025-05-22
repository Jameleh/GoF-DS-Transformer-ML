public class CharacterFlyweight implements Flyweight {
    private final char intrinsicState;

    public CharacterFlyweight(char intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void render(String extrinsicState) {
        System.out.println("Character: " + intrinsicState + ", Formatting: " + extrinsicState);
    }
}

