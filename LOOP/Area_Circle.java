// package JAVA.LOOP;

import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Enter radius of Circle: ");
            int radius=sc.nextInt();
            double area=3.14*radius*radius;
            System.out.println("Area of Circle is: "+area);
            System.out.println("Do you want to continue Yes/No");
            String str=sc.next();
            if(!(str.equals("Yes"))){
                break;
            }
        }
        sc.close();
    }
}
