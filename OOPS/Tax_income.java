package OOPS;

import java.util.Scanner;

public class Tax_income {
    double grossAnnualIncome;
    Scanner sc=new Scanner(System.in);
    void getInfo(){
        System.out.println("Enter your Gross Annual income: ");
        grossAnnualIncome=sc.nextDouble();
    }
    void setInfo(){
        double paybleTax;
        if(grossAnnualIncome<=100000){
            paybleTax=0;
        }
        else if(grossAnnualIncome>100000 && grossAnnualIncome<500000){
            paybleTax=1000+(0.1*(grossAnnualIncome-100000));
            System.out.println("Your Payable Tax is: "+paybleTax);
        }
        else if(grossAnnualIncome>500000 && grossAnnualIncome<800000){
            paybleTax=5000+(0.2*(grossAnnualIncome-500000));
            System.out.println("Your Payable Tax is: "+paybleTax);
        }
        else if(grossAnnualIncome>800000){
           paybleTax= 10000+(0.3*(grossAnnualIncome-800000));
            System.out.println("Your Payable Tax is: "+paybleTax);
        }
        
    }
    public static void main(String[] args) {
        Tax_income obj=new Tax_income();
        obj.getInfo();
        obj.setInfo();
    }
}
