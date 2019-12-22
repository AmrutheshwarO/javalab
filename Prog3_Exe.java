import java.util.*;
public class Prog3_Exe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Prog3_Stack A= new Prog3_Stack();
        System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
        for(;;){
            System.out.println("Enter your choice.");
            int ch= sc.nextInt();
            switch(ch){
                case 1: A.push();
                        break;
                case 2: A.pop();
                        break;
                case 3: A.display();
                        break;
                case 4: System.exit(0);
                        break;
                default: System.out.println("Invalid choice.");
                         break;
            }
        }
    }
}
