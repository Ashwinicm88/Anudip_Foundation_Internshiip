package OOPS;

// import java.util.Scanner;

// public class Teacher {
//     public static void main(String[] args) {
//       Science obj=new Science();
//       obj.getInfo();
//       obj.addHRA();
//       obj.scienceTeacher();  
//     }    
//     }
// class Teacher_Details {
//     int tId;
//     String tName;
//     double tSalary;
//     Scanner sc=new Scanner(System.in);
//     void getInfo(){
//         System.out.println("Enter Teacher Id: ");
//         tId=sc.nextInt();
//         sc.nextLine();
//         System.out.println("Enter Teacher Name: ");
//         tName=sc.nextLine();
//         System.out.println("Enter Teacher Salary: ");
//         tSalary=sc.nextDouble();
//     }
    
// }
// class HRA extends Teacher_Details{
//     double salaryHRA;
//     void addHRA(){
//         salaryHRA=tSalary+(tSalary*0.12);
//         System.out.println("Before adding HRA salary: "+tSalary+"\n"+"After adding HRA salary: "+salaryHRA);
//     }

// }
// class Science extends HRA{
//     double totalSalary;
//     void scienceTeacher(){
//         totalSalary=salaryHRA+5000;
//         System.out.println("The total salary of Science Teacher is: "+totalSalary);
//     }
// }
import java.util.Scanner;

class Teacher {
    public static void main(String args[]) {
        Science s = new Science();
        s.accept();
        s.addhra();
        s.scienceteacher();
    }
}
class Teacher_Details {
    int tid;
    String tname;
    double sal;
    Scanner sc = new Scanner(System.in);

    public void accept(){
        System.out.println("Enter tid,tname and salary:");
        tid=sc.nextInt();
        sc.nextLine();
        tname=sc.nextLine();
        sal=sc.nextDouble();
    }

}

class Hra extends Teacher_Details{
    double salhra;

    public void addhra() {
        salhra = sal + (sal * 0.12);
        System.out.println("The salary after adding bonus is:" + salhra);
    }

}

class Science extends Hra {
    double totalsal;

    public void scienceteacher() {
        totalsal = salhra + 5000;
        System.out.println("The final amount of science teacher is:" + totalsal);
    }
}


