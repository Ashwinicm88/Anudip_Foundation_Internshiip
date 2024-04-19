package OOPS;
import java.util.*;
public class Student {
    int physics,maths,bio;
    Scanner sc=new Scanner(System.in);
    void getInfo(){
        System.out.println("Enter a Marks of Student in Physics,maths and bio: ");
        physics=sc.nextInt();
        maths=sc.nextInt();
        bio=sc.nextInt();
    }
    void setInfo(){
        if(maths>85 && bio>85){
            System.out.println("You can choose either Engineer or Medical field");
        }
        else if(bio>85){
            System.out.println("He / She is a Medical Student");
        }
        else if(maths>85){
            System.out.println("He/ She is an Engineer Student");
        }
    }
    public static void main(String[] args) {
        Student obj=new Student();
        obj.getInfo();
        obj.setInfo();
    }

}
