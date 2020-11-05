public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        Circle circle = new Circle("black", false, 4.5);
        Rectangle rectangle = new Rectangle("white", true, 1.4, 22.5);
        Square square = new Square("red", true, 28.1, 9.4,1.2);

        System.out.println("" + shape);
        System.out.println("" + circle);
        System.out.println("" + rectangle);
        System.out.println("" + square);

        System.out.println("" + circle.getPerimeter());
        System.out.println("" + circle.getArea());

        System.out.println("" + rectangle.getPerimeter());
        System.out.println("" + rectangle.getArea());


    }
}
