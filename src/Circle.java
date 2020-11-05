public class Circle extends Shape{
    private double radius;

    public Circle(){
        setRadius(1.0);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                ",radius=" + radius +
                ']';
    }
}
