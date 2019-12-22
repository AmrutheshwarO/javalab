import java.util.*;
public class Prog8_Exe {
    public static void main(String[] args) {
        double r, h, ang;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle.");
        r = sc.nextDouble();
        System.out.println("Enter the control angle in degrees.");
        ang = sc.nextDouble();
        System.out.println("Enter the segment of the  circle.");
        h = sc.nextDouble();
        Prog8_Circle A = new Prog8_Circle(r);
        Prog8_Segment B = new Prog8_Segment(r, h);
        Prog8_Sector C = new Prog8_Sector(r, ang);
        System.out.println("Area of the circle= %.2f" + A.area());
        System.out.println("Area of the sector of the circle= %.2f" + C.area());
        System.out.println("Area of the segment of the circle= %.2f" + B.area());
    }
}
