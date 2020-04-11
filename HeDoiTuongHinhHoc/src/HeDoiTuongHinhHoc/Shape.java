package HeDoiTuongHinhHoc;

public class Shape {
    private String color = "Green";
    private boolean filled = true;
    public Shape() {
    }
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled  = filled;
    }
    public boolean getFilled(){
        return this.filled;
    }
    public  String getColor(){
        return this.color;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public boolean setFilled(boolean filled){
        return this.filled = filled;
    }
    public String toString(){
        return "A Shape with color of : "
                +this.getColor()+
                " and "+
                (getFilled()? "is filled":"is not filled");
    }
}
