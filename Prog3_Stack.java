import java.util.*;
public class Prog3_Stack {
    Scanner sc=new Scanner(System.in);
    int size=5;
    int[] a=new int[size];
    int top=-1;
    void push(){
        try {
            if (top >= size-1)
                throw new ArrayIndexOutOfBoundsException();
            else {
                System.out.println("Enter element.");
                a[++top] = sc.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack overflow.");
        }
    }
    void pop(){
        try {
            if (top == -1)
                throw new ArrayIndexOutOfBoundsException();
            else
                top--;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stack underflow.");
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else
            for (int i = top; i > -1; i--) {
                System.out.println(a[i]);
            }
    }
}
