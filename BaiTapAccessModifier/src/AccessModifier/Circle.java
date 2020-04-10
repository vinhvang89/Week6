package AccessModifier;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius){
      this.radius = radius;
    }
    double getRadius(){
        return this.radius;
    }
    double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    double getPerimeter(){
        return  this.radius*2*Math.PI;
    }
}
