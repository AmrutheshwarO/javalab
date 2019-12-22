import java.util.*;
public class Prog2_Account {
    String name;
    Long acc_no, ph_no, bal, amount;
    Scanner sc=new Scanner(System.in);
    void get_input(){
        System.out.println("Enter name.");
        name=sc.nextLine();
        System.out.println("Enter account number.");
        acc_no=sc.nextLong();
        System.out.println("Enter phone number.");
        ph_no=sc.nextLong();
        System.out.println("Enter balance.");
        bal=sc.nextLong();
    }
    void deposit(){
        System.out.println("Enter the amount to be deposited.");
        int deposit=sc.nextInt();
        bal+=deposit;
        System.out.println("Your account balance is " +bal);
    }
    void withdraw(){
        System.out.println("Enter the amount for withdrawal.");
        amount=sc.nextLong();
        if(amount>bal)
            System.out.println("Withdraw unable to process.");
        else
            bal-=amount;
        System.out.println("Your account balance is "+bal);
    }
}
