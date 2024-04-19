

import java.util.Scanner;

public class Swap_without3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Two values: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("The value of num1: "+num1);
        System.out.println("The value of num2: "+num2);
        sc.close();
    }
}
