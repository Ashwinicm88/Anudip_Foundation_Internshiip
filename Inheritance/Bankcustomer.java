package Inheritance;

public class Bankcustomer {
    private int acno;
    private String atype;
    private double amount;
    public Bankcustomer(){
        acno=0;
        atype="";
        amount=0;
    }
    public Bankcustomer(int acno){
        this.acno=acno;
        atype="";
        amount=0;
    }
    public Bankcustomer(int acno, String atype){
        this.acno=acno;
        this.atype=atype;
        amount=0;
    }
    public Bankcustomer(int acno,String atype,double amount){
        this.acno=acno;
        this.atype=atype;
        this.amount=amount;
    }
    public String toString(){
        return acno+" "+atype+" "+amount;
    }
public static void main(String[] args) {
    Bankcustomer obj=new Bankcustomer();
    Bankcustomer obj1=new Bankcustomer(1);
    Bankcustomer obj2=new Bankcustomer(1,"saving");
    Bankcustomer obj3=new Bankcustomer(2,"current",20000.0);
    System.out.println(obj);
    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj3);


}
}
