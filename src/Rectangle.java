public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        setWidth(1.0);
        setLength(1.0);
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width*2)+(length*2);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
                ",width=" + width +
                ",length=" + length +
                ']';
    }
}
