public class Square extends Rectangle {
    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public void setSize(double size) {
        this.setWidth(size);
        this.setHeight(size);
    }

    public double getSize(double size) {
        return this.getWidth();
    }

    @Override
    public void setWidth(double size) {
        setSize(size);
    }

    @Override
    public void setHeight(double size) {
        setSize(size);
    }

    @Override
    public String toString() {
        return "A square with size of " + this.getWidth() +
                ", which is a subclass of " + super.toString();
    }
}
