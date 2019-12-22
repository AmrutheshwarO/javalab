import java.lang.*;
public class Prog8_Circle {
    double r;
    Prog8_Circle(double r){
        this.r=r;
    }
    public double area(){
        return Math.PI*Math.pow(r, 2);
    }
}
