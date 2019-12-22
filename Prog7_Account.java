import java.util.*;
public class Prog7_Account {
    String name;
    int age, accno, edu, salary, yoe, nol, loanamt;
    float tax;
    Scanner sc= new Scanner(System.in);
    public Prog7_Account(String name, int accno, int age, int edu, int yoe, int salary, int nol, int loanamt) {
        this.name= name;
        this.accno=accno;
        this.age=age;
        this.edu=edu;
        this.yoe=yoe;
        this.salary=salary;
        this.nol=nol;
        this.loanamt=loanamt;
    }
    void eligibilty() {
        if(yoe<=3&&salary<=30000&&age<=22&&nol>=2&&loanamt>=100000) {
            System.out.println("Not eligible for Loan.");
            System.exit(0);
        }
        else
        {
            System.out.println("You are eligible for the loan.");
        }

    }
    void taxPay() {
        if(loanamt<=250000) {
            tax=0.15f*loanamt;
            loanamt-=tax;
            System.out.println("The deducted tax amt is Rs." +tax+". \nYou are eligible for a loan of Rs."+loanamt);
        }
        else if(loanamt<=500000) {
            tax=0.15f*loanamt;
            loanamt-=tax;
            System.out.println("The deducted tax amt is Rs." +tax+". \nYou are eligible for a loan of Rs."+loanamt);
        }
        else {
            tax=0.15f*loanamt;
            loanamt-=tax;
            System.out.println("The deducted tax amt is Rs." +tax+". \nYou are eligible for a loan of Rs."+loanamt);
        }
    }
    boolean eligPromo() {
        if(yoe>=4&&nol<=2&&age>=25)
            return true;
        else
            return false;
    }
    void display() {
        System.out.println("Account Details.");
        System.out.println("1. Name:"+name);
        System.out.println("2. Account number:"+accno);
        System.out.println("3. Age:"+age);
        System.out.println("4. Educational Qualifications:"+edu);
        System.out.println("5. Years of experience:"+yoe);
        System.out.println("6. Salary(Basic+DA+HRA):"+salary);
        System.out.println("7. Number of loans:"+nol);
        System.out.println("8. Requested loan amount is Rs."+loanamt);
        if(eligPromo())
            System.out.println("9. Eligibility for promotion: Yes");
        else
            System.out.println("9. Eligibility for promotion: No");
    }
}