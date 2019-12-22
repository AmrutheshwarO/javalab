package Prog11_StudentPackage;
import java.util.*;

public class Prog11_RegisterStudent {
    public Prog11_RegisterStudent(){
        Prog11_Student ob= new Prog11_student();
        ob.getName();
        ob.getBranch();
        System.out.println("Enter the total number of credits registered.");
        int tot_cr=(new Scanner(System.in)).nextInt();
        try{
            if(tot_cr>30)
                throw new Prog11_CreditLimit(tot_cr);
            else
                System.out.println("The total credit is "+tot_cr);
        }
        catch(Exception e){
            System.out.println(e+"\nException: Total credits is more than 30.\n");
            System.exit(0);
        }
        ((Prog11_student)ob).collectMarks();
    }
}
