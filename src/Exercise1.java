public class Exercise1 {
    // [Thực hành] Hệ các đối tượng hình học
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red", true);
        Rectangle rect = new Rectangle(7, 4, "blue", false);
        Square square = new Square(6, "gray", true);

        System.out.println(circle);
        System.out.println(rect);
        System.out.println(square);
    }
}
