package CircleNCylinder;

public class Cylinder extends Circle {
    private double height;
    private double radius;
    public Cylinder(double height , double radius){
        super(radius);
        this.height = height;
    }
    public Cylinder(double height,double radius,String color,boolean filled){
        super(radius,color,filled);
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*this.height;
    }

}
