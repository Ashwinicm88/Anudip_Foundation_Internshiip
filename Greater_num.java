
import java.util.Scanner;

public class Greater_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number ");
        int num1=sc.nextInt();
        System.out.println("Enter a second number ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" is a greater number.");
        }
        else{
            System.out.println(num2+" is a greater number.");
        }
        sc.close();
    }
}
