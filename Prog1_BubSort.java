public class Prog1_BubSort {
    int[] a= new int[30];
    int n, i, j;
    Prog1_BubSort(int a[], int n) {
        this.a = a;
        this.n=n;
    }
    void bubble_sort(){
        for(i=0; i<n; i++)
            for(j=0; j<i; j++)
                if(a[i]<a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
    }
}

