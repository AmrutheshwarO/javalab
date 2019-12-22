public class Prog1_Prime {
    int i=2;
    int check(int n){
        for(; i<=n; i++){
            if(n%i!=0);
            else{
                break;
            }
        }
        if(i>=n||n==1)
            return 1;
        else
            return 0;
    }
}
