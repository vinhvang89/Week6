package CircleNCylinder;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color,boolean filled ){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    protected double getRadius(){
        return this.radius;
    }
    protected double setRadius(double radius){
        return this.radius = radius;
    }
    protected double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    protected double getPerimeter(){
        return this.radius*2*Math.PI;
    }
}
