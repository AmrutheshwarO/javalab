import java.util.*;
public class Prog5_MulMat {
    Scanner sc = new Scanner(System.in);
    int[][] A = new int[10][10], B = new int[10][10], prod = new int[10][10];
    int r1, c1, r2, c2, k;

    public Prog5_MulMat() {
        System.out.printf("Enter the order of the first matrix.\n");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.printf("Enter the order of the second matrix.\n");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
    }

    void check() {
        if (c1 != r2) {
            System.out.printf("Matrices cannot be multiplied.\n");
            System.exit(0);
        }
    }
    void getdata(){
        System.out.printf("Enter the elements of the first matrix.\n");
        for(int i=0; i<r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j]=sc.nextInt();
        System.out.printf("Enter the elements of the second matrix.\n");
        for(int i=0; i<r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j]=sc.nextInt();
    }

    void display() {
        System.out.printf("The first matrix is\n");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.printf(A[i][j] + "\t");
            }
            System.out.printf("\n");
        }
        System.out.printf("The second matrix is\n");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf(B[i][j] + "\t");
            }
            System.out.printf("\n");
        }
        System.out.printf("The product matrix is\n");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < r2; k++)
                    prod[i][j] += (A[i][k] * B[k][j]);
                System.out.printf(prod[i][j] + "\t");
            }
            System.out.printf("\n");
        }
    }
}
