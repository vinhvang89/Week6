public class Fan {
    boolean power = false;
    double radius;
    String color;
    int speed;
    public Fan(){

    }
    public Fan(boolean power,double radius,String color,int speed){
        this.power = power;
        this.radius = radius;
        this.color = color;
        this.speed = speed;
    }
    public String getPower(){
        if (!this.power) return "This is Off";
        else return "This is On";
    }
    public double getRadius(){
        return this.radius;
    }
    public  String getColor(){
        return this.color;
    }
    public int getSpeed(){
        return this.speed;
    }


}
