package Inheritance;

public class Bank{
    public static void main(String[] args) {
        BankBalance b=new BankBalance(10000.0);
        b.withdraw(20000.0);
        b.deposite(10000.0);
    }
}
class BankBalance {
    private double amount;
    public BankBalance(double a){
        this.amount=a;
    }
    public void withdraw(double w){
        System.out.println("*Withdraw*");
        if(w<=this.amount){
            this.amount-=w;
            System.out.println("Withdraw Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
        System.out.println("Current Balance: "+this.amount);
    }
    public void deposite(double da){
        System.out.println("*Deposite*");
        this.amount+=da;
        System.out.println("Total Balance: "+this.amount);
    }
}
