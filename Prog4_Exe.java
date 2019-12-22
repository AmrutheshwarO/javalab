import java.util.*;
public class Prog4_Exe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the two complex numbers.");
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        int r2=sc.nextInt();
        int i2=sc.nextInt();
        Prog4_Complex A= new Prog4_Complex(r1, i1, r2, i2);
        A.add();
    }
}
