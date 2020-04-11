package CircleNCylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(30,10);
        Cylinder cylinder2 = new Cylinder(20,5,"Blue",true);
        System.out.println(cylinder1.getVolume());
        System.out.println(cylinder2.getPerimeter());
    }
}
