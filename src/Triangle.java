public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        super();
        side1 = side2 = side3 = 1.0f;
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2)
            throw new ArithmeticException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, Boolean filled) {
        super(color, filled);
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2)
            throw new ArithmeticException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getAngle1() {
        return Math.acos(Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(side1, 2) / (2 * side2 * side3));
    }

    public double getAngle2() {
        return Math.acos(Math.pow(side1, 2) + Math.pow(side3, 2) - Math.pow(side2, 2) / (2 * side1 * side3));
    }

    public double getAngle3() {
        return Math.acos(Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2) / (2 * side1 * side2));
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "}, Which is a subclass of " + super.toString();
    }
}
