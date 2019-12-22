package Prog11_StudentPackage;

class Prog11_CreditLimit extends Exception{
    Prog11_CreditLimit(int i){
        System.out.println("The total credit is "+i);
    }
}