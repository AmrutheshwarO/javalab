import java.lang.*;
public class Prog8_Sector extends Prog8_Circle{
    double ang;
    Prog8_Sector(double r, double ang){
        super(r);
        this.ang=Math.toRadians(ang);
    }
    public double area(){
        return ((0.5)*Math.pow(r,2)*ang);
    }
}
