import java.util.Scanner;
public class Prog9_TwoWheeler extends Prog9_Vehicle{
    int year1;
    Scanner sc= new Scanner(System.in);
    Prog9_TwoWheeler(int year){
        super(year);
    }
    public Prog9_TwoWheeler() {
    }
    @Override
    void getData() {
        System.out.println("Enter year of manufacture of two wheeler vehicle.");
        year1=sc.nextInt();
    }
    @Override
    void putData() {
        System.out.println("Year of manufacture: "+year1);
    }
}
