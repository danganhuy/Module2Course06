public class Cylinder extends Circle2{
    private double height;

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height * super.getPerimeter()) + (2 * super.getArea());
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + super.getRadius() +
                ", color='" + super.getRadius() + '\'' +
                '}';
    }
}
