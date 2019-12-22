//Prog9_Exe
import java.util.Scanner;
public class Prog9_MyVehicle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Prog9_Vehicle V1;
        V1= new Prog9_TwoWheeler();
        V1.getData();
        V1.putData();
        V1= new Prog9_FourWheeler();
        V1.getData();
        V1.putData();
        System.out.println("Enter the year of manufacture of your two wheeler vehicle.");
        int year3= sc.nextInt();
        V1= new Prog9_MyTwoWheeler(year3);
    }
}
