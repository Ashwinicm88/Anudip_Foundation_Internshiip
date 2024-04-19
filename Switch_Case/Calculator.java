package Switch_Case;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Addition \n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Reminder");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                int a=sc.nextInt();
                System.out.println("Enter a value b: ");
                int b=sc.nextInt();
                System.out.println("Addition : "+(a+b));
                break;
            case 2:
                a=sc.nextInt();
                System.out.println("Enter a value b: ");
                b=sc.nextInt();
                System.out.println("Subtraction : "+(a-b));
                break;
            case 3:
                a=sc.nextInt();
                System.out.println("Enter a value b: ");
                b=sc.nextInt();
                System.out.println("Multiplication"+(a*b));
                break;
            case 4:
                a=sc.nextInt();
                System.out.println("Enter a value b: ");
                b=sc.nextInt();
                System.out.println("Division"+(a/b));
                break;
            case 5:
                a=sc.nextInt();
                System.out.println("Enter a value b: ");
                b=sc.nextInt();
                System.out.println("Reminder"+(a%b));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
}
}