import java.lang.*;
public class Prog8_Segment extends Prog8_Circle{
    double h;
    Prog8_Segment(double r, double h){
        super(r);
        this.h=h;
    }
    public double area(){
        return (Math.pow(r, 2)*((r-h)/r)-(r-h)*Math.pow((2*r*h-Math.pow(h, 2)), 0.5));
    }
}
