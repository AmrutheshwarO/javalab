public abstract class Prog9_Vehicle {
    int year_of_manufacture;
    Prog9_Vehicle(int year){
        System.out.println("Year of manufacture: "+year);
    }
    public Prog9_Vehicle(){
    }
    abstract void getData();
    abstract void putData();
}
