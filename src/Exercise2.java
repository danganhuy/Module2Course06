public class Exercise2 {
    // [Bài tập] Lớp Circle và lớp Cylinder
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5, "black");
        Cylinder cylinder = new Cylinder(18, 5, "red");
        System.out.println(circle);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
    }
}
