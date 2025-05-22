public class Main {
    private static MathAdapter mathAdapter = new MathAdapter();

    public static void main(String[] args) {
        System.out.println("-- Operações --");

        System.out.print("3 - 2 = ");
        System.out.println(mathAdapter.subtract(3, 2));

        System.out.print("\n7 + 9 = ");
        System.out.println(mathAdapter.add(7, 9));

        System.out.print("\n7 ^ 7 = ");
        System.out.println(mathAdapter.pow(7, 7));
    }
}
