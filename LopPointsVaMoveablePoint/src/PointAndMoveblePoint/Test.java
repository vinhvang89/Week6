package PointAndMoveblePoint;

public class Test {
    public static void main(String[] args) {
        MoveablePoint a = new MoveablePoint(3,5,4,2);
        a.move();
        System.out.println(a.getX());
        System.out.println(a.getY());
    }
}
