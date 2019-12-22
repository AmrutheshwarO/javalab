package Prog11_StudentPackage;
import java.util.*;

public class RegisterStudent{
    public RegisterStudent(){
        Student ob= new student();
        ob.getName();
        ob.getBranch();
        System.out.println("Enter the total number of credits registered.");
        int tot_cr=(new Scanner(System.in)).nextInt();
        try{
            if(tot_cr>30)
                throw new CreditLimit(tot_cr);
            else
                System.out.println("The total credit is "+tot_cr);
        }
        catch(Exception e){
            System.out.println(e+"\nException: Total credits is more than 30.\n");
            System.exit(0);
        }
        ((student)ob).collectMarks();
    }
}
