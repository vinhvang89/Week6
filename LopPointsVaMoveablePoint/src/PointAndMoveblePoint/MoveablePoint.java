package PointAndMoveblePoint;

public class MoveablePoint extends Point {
    private float speedX = 0;
    private float speedY = 0;
    public MoveablePoint(float x, float y,float speedX,float speedY){
        super(x,y);
        this.speedX = speedX;
        this.speedY = speedY;
    }
    public float getSpeedX(){
        return this.speedX;
    }
    public float getSpeedY(){
        return  this.speedY;
    }
    public void setSpeedX(float speedX){
        this.speedX = speedX;
    }
    public void setSpeedY(float speedY){
        this.speedY = speedY;
    }
    public void setSpeed(float speedX,float speedY){
        this.speedX = speedX;
        this.speedY = speedY;
    }
    public void move(){
        float a = super.getX() + this.speedX;
        float b = super.getY() + this.speedY;
        super.setXY(a,b);
    }


}
