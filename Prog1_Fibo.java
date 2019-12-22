public class Prog1_Fibo {
    int a1, a2, temp, i, n;
    Prog1_Fibo(int n){
        this.n=n;
    }
    void norecur(){
        System.out.println("Without using recursion.");
        for(i=0; i<n; i++){
            if(i==0) {
                a1 = 0;
                a2 = 1;
            }
            System.out.print(a1+",\t");
            temp=a1+a2;
            a1=a2;
            a2=temp;
        }
    }
    int recur(int p){
        if(p==0)
            return 0;
        else if(p==1||p==2)
            return 1;
        else
            return recur(p-2)+recur(p-1);
    }
}
