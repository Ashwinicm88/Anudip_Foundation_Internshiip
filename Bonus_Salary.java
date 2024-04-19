
import java.util.*;
public class Bonus_Salary {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        int salary=sc.nextInt();
        System.out.println("Enter year of service: ");
        int year=sc.nextInt();
        double net_bonus_amount;
        if(year>=5){
            net_bonus_amount=(salary*0.05);
            System.out.println("Net bonus salary is "+net_bonus_amount);
        }
        else{
            System.out.println("You need more experience to get Bonus");
        }
        sc.close();
    }
 }   

