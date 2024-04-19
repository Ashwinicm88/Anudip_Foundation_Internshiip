
import java.util.*;
public class Emp_Allowance {
    double eBalance=25000;
     Scanner sc=new Scanner(System.in);
    public void deposited(){
        double deposit;
        System.out.println("Enter a deposited amount: ");
        deposit=sc.nextDouble();
        eBalance+=deposit;
        System.out.println(deposit+ "After deposite Total Amount is: "+eBalance);
    }
    public void transfered(){
        double transer;
        System.out.println("Enter the Transfered amount: ");
        transer=sc.nextDouble();
        eBalance-=transer;
        System.out.println(transer+" After tranfering the Remaining Balance is: "+eBalance);
    }
 public static void main(String[] args) {
    Emp_Allowance obj=new Emp_Allowance();
    obj.deposited();
    obj.transfered();
    double daPercentage = 12;
    double hraPercentage = 13;
    double pfPercentage = 15;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Current Salary: ");
    double salary=sc.nextDouble();
    double da = (daPercentage / 100) * salary;
    double hra = (hraPercentage / 100) * salary;
    double pf = (pfPercentage / 100) * salary;

    // Calculate gross salary
    double gross = salary + da + hra - pf;

  
    System.out.println("Dearness Allowance (DA): " + da);
    System.out.println("House Rent Allowance (HRA): " + hra);
    System.out.println("Provident Fund (PF): " + pf);
    System.out.println("Gross Salary: " + gross);

sc.close();
 }   
}
