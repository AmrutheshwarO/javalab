import java.util.Scanner;
public class Prog12_Exe {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Prog12_QofStrings Queue = new Prog12_QofStrings();
       System.out.println("1. Insert\n2. Delete\n3. Display\n4. Exit queue functions");
       while(true) {
           System.out.println("Enter your choice.");
           int ch = sc.nextInt();
           switch (ch) {
               case 1:
                   Queue.insert();
                   break;
               case 2:
                   Queue.delete();
                   break;
               case 3:
                   Queue.display();
                   break;
           }
           if (ch == 4)
               break;
       }
       Prog12_LL myList = new Prog12_LL();
       System.out.println("1. Insert names(string)\n2. Complete Insertion");
       String str=new String();
       while(true){
           System.out.println("Enter your choice.");
           int ch=sc.nextInt();
           switch (ch){
               case 1:
                   System.out.println("Enter names.");
                   sc.nextLine();
                   str=sc.nextLine();
                   myList.addName(str);
                   break;
           }
           if(ch==2)
               break;
       }
       myList.disp();
   }
}

