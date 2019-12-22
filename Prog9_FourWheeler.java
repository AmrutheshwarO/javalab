import java.util.Scanner;
public class Prog9_FourWheeler extends Prog9_Vehicle {
    int year2;
    Scanner sc= new Scanner(System.in);
    Prog9_FourWheeler(int year){
        super(year);
    }
    public Prog9_FourWheeler(){
    }

    @Override
    void getData() {
        System.out.println("Enter year of manufacture of four wheeler vehicle.");
        year2=sc.nextInt();
    }

    @Override
    void putData() {
        System.out.println("Year of manufacture: "+year2);
    }
}
