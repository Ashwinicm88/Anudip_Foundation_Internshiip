package Inheritance;
import java.util.*;
public class Student {
    int stdId,marks;
    String sName;
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter Student id,name and marks: ");
        stdId=sc.nextInt();
        sc.nextLine();
        sName=sc.nextLine();
        
        marks=sc.nextInt();
    }    
    void output(){
        System.out.println("Stude Id: "+stdId);
        System.out.println("Student Name: "+sName.toString());
        System.out.println("Student Marks: "+marks);

    }
    public static void main(String[] args) {
        Student obj=new Student();
        obj.input();
        obj.output();
    }
}
