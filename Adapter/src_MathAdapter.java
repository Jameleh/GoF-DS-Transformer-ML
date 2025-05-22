public class MathAdapter {
    public int add(int a, int b) {
        return new LegacyComponent(a, b, "soma").execute();
    }

    public int subtract(int a, int b) {
        return new LegacyComponent(a, b, "subtração").execute();
    }

    public int pow(int a, int b) {
        return new LegacyComponent(a, b, "exponenciação").execute();
    }
}
