package PointAndMoveblePoint;

public class Point {
    private float x = 0;
    private float y = 0;
    public Point(){

    }
    protected Point(float x,float y){
        this.x = x;
        this.y = y;
    }
    protected float getX(){
        return  this.x;
    }
    protected void setX( float x){
        this.x = x;
    }
    protected float getY(){
        return this.y;
    }
    protected void  setY(float y){
        this.y = y;
    }
    protected void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "( "+this.x+" , "+this.y+" )";
    }
}
