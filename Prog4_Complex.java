import java.util.Scanner;
public class Prog4_Complex {
    int r1, i1, r2, i2, sum_r, sum_i, prod_r, prod_i;
    Scanner sc=new Scanner(System.in);
    Prog4_Complex(int r1, int i1, int r2, int i2){
        this.r1= r1;
        this.i1=i1;
        this.r2=r2;
        this.i2=i2;
    }
    void add(){
        sum_r=r1+r2;
        sum_i=i1+i2;
        if(sum_i<0)
            System.out.println("Sum = "+sum_r+"+"+sum_i+"i");
        else if(sum_i>0)
            System.out.println("Sum = "+sum_r+"-"+sum_i+"i");
        else
            System.out.println("Sum = "+sum_r);
        System.out.println("Product = " +(r1*r2)+""+((r1*i2)+(r2*i1))+"i"+(-(i1*i2)));
    }
}
