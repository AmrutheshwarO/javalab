import java.rmi.UnexpectedException;
import java.util.Scanner;
public class Prog1_Exe {
    public static void main(String[] args) {
        int a[]= new int[30];
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series elements required.");
        Prog1_Fibo A=new Prog1_Fibo(sc.nextInt());
        System.out.println("The first "+A.n+" elements of fibonacci series is");
        A.norecur();
        System.out.println();
        System.out.println("Using recursion.");
        for(int i=0; i<A.n; i++)
            System.out.print(A.recur(i)+",\t");
        System.out.println();
        Prog1_Prime B= new Prog1_Prime();
        System.out.println("Enter the number for prime number check.");
        if(B.check(sc.nextInt())==0)
            System.out.println("Composite number.");
        else
            System.out.println("Prime number.");
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++)
            a[i]=sc.nextInt();
        Prog1_BubSort C= new Prog1_BubSort(a, n);
        System.out.println("The sorted array is");
        C.bubble_sort();
        for(int i=0; i<n; i++)
            System.out.print(a[i]+"\t");
    }
}