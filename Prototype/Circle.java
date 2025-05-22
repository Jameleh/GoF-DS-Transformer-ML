public class Circle implements  Shape {
    private int coordX;
    private int coordY;
    private int radix;

    public Circle(int coordX, int coordY, int radix) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.radix = radix;
    }

    @Override
    public Shape clone() {
        return new Circle(this.coordX, this.coordY, this.radix);
    }
}
