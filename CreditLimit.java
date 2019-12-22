package Prog11_StudentPackage;

class CreditLimit extends Exception{
    CreditLimit(int i){
        System.out.println("The total credit is "+i);
    }
}