// package JAVA;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 2 number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The value of num1: "+num1);
        System.out.println("The value of Num2: "+num2);
        sc.close();
    }
}
