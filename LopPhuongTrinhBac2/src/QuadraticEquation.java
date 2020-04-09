public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta(){
        return this.b*this.b - 4*this.a*this.c;
    }
    public String checkRoot() {
        if ( this.getDelta() < 0 )
            return "The equation has no roots";
        else if ( this.getDelta() == 0 )
            return "The equation has a root";
        else
            return "The equation has 2 roots";

    }
    public double getRoot1(){
        return (-this.b + Math.sqrt(this.getDelta()) )/ 2*this.a;
    }
    public double getRoot2(){
        return (-this.b - Math.sqrt(this.getDelta()) )/ 2*this.a;
    }
}
