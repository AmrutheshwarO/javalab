import java.util.*;
public class Prog7_Exe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Amrutheshwar's loan facilities.");
        System.out.println("Enter the following credentials." );
        System.out.println("Name.");
        String name=sc.nextLine();
        System.out.println("Account number.");
        int accno= sc.nextInt();
        System.out.println("Age.");
        int age=sc.nextInt();
        System.out.println("Years of education.");
        int edu=sc.nextInt();
        System.out.println("Years of experience.");
        int yoe=sc.nextInt();
        System.out.println("Salary(basic).");
        int salary=sc.nextInt();
        System.out.println("Number of loans so far sanctioned.");
        int nol=sc.nextInt();
        System.out.println("Loan amount required.");
        int loanamt=sc.nextInt();
        System.out.println();
        salary*=2.5;
        Prog7_Account A=new Prog7_Account(name, accno, age, edu, yoe, salary, nol, loanamt);
        A.display();
        A.taxPay();
    }
}


