package OOPS;

import java.util.Scanner;

public class Sum_digit {
    int number;
    Scanner sc=new Scanner(System.in);
    void getNum(){
        System.out.println("Enter a Number: ");
        number=sc.nextInt();
    }
    void setNum(){
        int result=0;
        while (number>0) {
            int rem=number%10;
            result+=rem;
            number/=10;
                }
        System.out.println("Sum of digit is: "+result);
    }
    public static void main(String[] args) {
        Sum_digit obj=new Sum_digit();
        obj.getNum();
        obj.setNum();
    }
}
