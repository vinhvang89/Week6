package Lop2Dva3D;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Class3D extends Class2D {
    private float z = 0;
    public Class3D(){

    }
    public Class3D(float x,float y,float z){
        super(x,y);
        this.z = z;
    }
    public float getZ(){
        return  this.z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x , float y , float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public String toString(){
        return "( "+super.getX()+" , " +super.getY()+ " , "+this.getZ()+ " )";
    }


}
