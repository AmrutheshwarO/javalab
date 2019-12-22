import java.util.*;
public class Prog2_Exe {
    public static void main(String[] args) {
        Prog2_Account A= new Prog2_Account();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your details.");
        A.get_input();
        for(;;){
            System.out.println("Enter your transaction type.");
            System.out.println("1. Deposit\n2. Withdraw\n3. Cancel ");
            int a=sc.nextInt();
            switch(a) {
                case 1:
                    A.deposit();
                    break;
                case 2:
                    A.withdraw();
                    break;
                case 3:
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Invalid entry");

            }
        }
    }
}
