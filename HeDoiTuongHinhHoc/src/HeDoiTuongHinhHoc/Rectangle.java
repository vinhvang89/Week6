package HeDoiTuongHinhHoc;

public class Rectangle extends Shape {
    double width;
    double height;
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width,double height,String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return  this.height*2 + this.width*2;
    }
    public String toString(){
        return "This rectangle with width = " +this.width+
                " and height = "+this.height+
                " , which is a subclass of " +
                super.toString();
    }
}
