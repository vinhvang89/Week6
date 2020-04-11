package Resizeable;

public abstract class Shape {
    String color = "Red";
    boolean filled = true;
    public Shape(){

    }
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }
}
class Triangle extends Shape implements Resizeable{
    double side1;
    double side2;
    double side3;
    public Triangle(double side1, double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1,double side2,double side3,String color,boolean filled){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public boolean isTriangle(){
        return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
    }
    @Override
    public void resize(double percent) {
        this.side1 += this.side1*percent;
        this.side2 += this.side2*percent;
        this.side3 += this.side3*percent;
    }
    public String getString(){
        return "Side 1 : " +this.side1+" Side 2 : " + this.side2+ " Side 3 : " + this.side3;
    }
}
class Rectangle extends Shape implements Resizeable{
    double width;
    double height;
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width,double height,String color ,boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        this.height += this.height*percent;
        this.width += this.width*percent;
    }
    public String toString(){
        return "Rectangle with width = "+this.width+" height = "+this.height;
    }
}
class Square extends Rectangle implements Resizeable{
    double size;
    public Square(double size){
        super(size,size);
    }
    public Square(double size,String color,boolean filled){
        super(size,size,color,filled);
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }
    public String toString(){
        return "This square has size = " + super.width;
    }
}
