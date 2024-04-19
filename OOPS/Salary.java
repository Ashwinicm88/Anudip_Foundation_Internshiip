package OOPS;

// import java.util.Scanner;
// public class Salary {
//     public static void main(String[] args) {
//         BonusSalary obj=new BonusSalary();
//         obj.getSalary();
//         obj.Display();
//     }
// }

// class GetSalary{
//     Scanner sc=new Scanner(System.in);
//     double Salary;
//     void getSalary(){
//         System.out.println("Enter your Salary: ");
//         Salary=sc.nextDouble();
//     }
// }
// class BonusSalary extends GetSalary{
//     void Display(){
//         double bonusSalary=0;
//         if(Salary<50000){
//             bonusSalary=Salary*0.10;
//             double totalSalary=bonusSalary+Salary;
//             System.out.println("The total salary with Bonus is: "+totalSalary);
//         }
//         else{
//             System.out.println("Sorry, You didn't get a Bonus");
//         }
//     }
// }
import java.util.Scanner;

public class Salary {
    public static void main(String args[]) {
        Bonus obj = new Bonus();
        obj.getSal();
        obj.setSal();
    }

}

class User {
    int sal;
    Scanner sc = new Scanner(System.in);

    public void getSal() {
        System.out.println("Enter the salary:");
        sal = sc.nextInt();
    }
}

class Bonus extends User {
    public void setSal() {
        double bonus = 0.0;
        if (sal < 50000) {
            bonus = sal * 0.10;
            double totalSal = sal + bonus;
            System.out.println("The salary with bonus is:" + totalSal);
        } else {
            System.out.println("The salary remains same without bonus.");
        }
    }
}

