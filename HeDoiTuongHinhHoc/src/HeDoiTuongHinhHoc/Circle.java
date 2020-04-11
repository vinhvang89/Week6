package HeDoiTuongHinhHoc;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public  double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    public double setRadius(double radius){
        return this.radius = radius;
    }
    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

}
