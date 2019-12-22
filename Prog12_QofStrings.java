import java.util.*;
public class Prog12_QofStrings {
    Scanner sc=new Scanner(System.in);
    int size=5;
    String[] A= new String[size];
    String data=new String();
    static int rear=-1, front=-1;
    void insert() throws ArrayIndexOutOfBoundsException {
        try {
            if (rear >= 4)
                throw new ArrayIndexOutOfBoundsException();
            else {
                System.out.println("Enter a string.");
                data = sc.nextLine();
                if (rear == -1 && front == -1) {
                    rear = 0;
                    front = 0;
                    A[rear] = data;
                } else {
                    ++rear;
                    A[rear] = data;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Queue is full.");
        }
    }
    void delete(){
        if(rear==-1) {
            rear = -1;
            front = -1;
            System.out.println("Queue is empty.");
        }
        else{
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else
                front++;
        }
    }
    void display(){
        if(rear==-1)
            System.out.println("Queue is empty.");
        else{
            for(int i=front; i<=rear; i++)
                System.out.println(A[i]);
        }
    }
}
