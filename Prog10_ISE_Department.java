package Prog10_ISE;
import java.util.*;

public class Prog10_ISE_Department implements Prog10_Department {
    Scanner sc= new Scanner(System.in);
    int i, n;
    Prog10_Faculty A= new Prog10_Faculty();
    @Override
    public void read_data() {
        System.out.println("Enter the number of faculty.");
        n = sc.nextInt();
        sc.nextLine();
        for (i = 0; i < n; i++) {
            System.out.println("Enter the name of faculty"+(i+1));
            A.name[i] = sc.nextLine();
            System.out.println("Enter the age of "+A.name[i]);
            A.age[i] = sc.nextInt();
            if(A.age[i]<20||A.age[i]>58) {
                try {
                    throw new Exception("Invalid age. Valid age is between 20 to 58\n");
                } catch (Exception e) {
                    System.out.println("Exception occured: " + e);
                }
            }
            System.out.println("Enter join date of "+A.name[i]);
            A.join_data[i] = sc.next();
            System.out.println("Enter the number of years of experience of "+A.name[i]);
            A.yoe[i] = sc.nextInt();
            System.out.println("Enter the number of subjects taught by "+A.name[i]);
            A.b[i]=sc.nextInt();
            for (int j = 0; j<A.b[i]; j++) {
                System.out.println("Enter subject"+(j+1));
                A.sub[i][j] = sc.next();
            }
            sc.nextLine();
            System.out.println("Enter designation of "+A.name[i]);
            A.designations[i]=sc.nextLine();
        }
    }
    @Override
    public void print_data() {
        System.out.println("The details of the faculty ");
        for(i=0; i<n; i++){
            System.out.println("Name: "+A.name[i]);
            System.out.println("Age: "+A.age[i]);
            System.out.println("Join date: "+A.join_data[i]);
            System.out.println("Years of experience: "+A.yoe[i]);
                for(int j=0; j<A.b[i]; j++)
                    System.out.println("Subject"+j+": "+A.sub[i][j]);
            System.out.println("Designations: "+A.designations[i]);
            print_number_designations();
            System.out.println("Number of research consultancy projects: "+number_research_consultancy_projs());
        }
    }
    @Override
    public int number_research_consultancy_projs() {
        return (A.yoe[i]*A.b[i])/4;
    }
    @Override
    public void print_number_designations() {
        int count= A.designations[i].length()-A.designations[i].replace(",","").length();
        System.out.println("Number of designations: "+(count+1));
    }
}
