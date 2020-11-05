public class Square extends Rectangle{
    double side;
    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
