public class Exercise4 {
    // [Bài tập] Lớp Point và MoveablePoint
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        MoveablePoint mp1 = new MoveablePoint(4,6,0.1,-0.2);

        System.out.println(p1);
        System.out.println(mp1);

        System.out.println(mp1.move());
        System.out.println(mp1.move());
        System.out.println(mp1.move());
        System.out.println(mp1.move());
        System.out.println(mp1.move());


    }
}
