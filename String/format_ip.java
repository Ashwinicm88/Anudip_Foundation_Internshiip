package String;

import java.util.Scanner;

public class format_ip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String myname;
        System.out.println("Enter your name: ");
        myname=sc.nextLine();

        System.out.println("You have entered"+" "+myname);
        System.out.println("Enter your name");
        myname=sc.next();
        System.out.println("you have entered"+" "+myname);
        System.out.println("first character is");
        System.out.println(myname.charAt(0));
        sc.close();
    }
}
