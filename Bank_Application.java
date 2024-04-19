
import java.util.*;
/**
 * Bank_Application
 */
 class Bank_Application {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank_Account obj=new Bank_Account();
        while (true) {
            System.out.println("\n*****Choose one of the option from below*****");
            System.out.println("1. Deposite"+"\n"+"2. Withdraw"+"\n"+"3. Current Balance"+"\n"+"4.Exit");
            System.out.println("Enter your Choice from 1 to 4: ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                       System.out.println("Enter amount to deposite: ");
                       double deposite=sc.nextDouble();
                       obj.deposite_amount(deposite); 
                    break;
                case 2:
                        System.out.println("Enter amount to withdraw: ");
                        double withdraw=sc.nextDouble();
                        obj.withdraw_amount(withdraw); 
                    break;
                case 3:
                        obj.checkBalance(); 
                        break;
                case 4:
                        System.out.println("Thank you, Have a Nice Day...!!!");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 4.");

            }
        }
    }
}

class Bank_Account {
    double Balance;
    public Bank_Account(){
        Balance=0.0;
    }
    public void deposite_amount(double amount){
        Balance=Balance+amount;
        System.out.println("Deposited Amount: "+amount+"\n"+"Current Balance: "+Balance);
    }
    public void withdraw_amount(double amount){
        if(amount<=Balance){
            Balance-=amount;
            System.out.println("Withdraw amount is: "+amount+"\n"+"Current Balance is: "+Balance);
        }
        else{
            System.out.println("You have less amount.");
        }
    }
    public void checkBalance(){
        System.out.println("Current Balance is: "+Balance);
    }
    
}


 