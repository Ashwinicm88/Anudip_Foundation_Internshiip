
import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a marks");
        System.out.println("Maths : ");
        int maths=sc.nextInt();
        System.out.println("English : ");
        int english=sc.nextInt();
        System.out.println("Science : ");
        int Science=sc.nextInt();
        System.out.println("History : ");
        int History=sc.nextInt();
        int total_score=maths+Science+english+History;
        double avg=(total_score)/4;
        if(avg>=80){
            System.out.println("You got a A+ Grade");
        
        }
        else if(avg<80 && avg>=60){
            System.out.println("You got a B+ Grade");
        }
        else if(avg<60 && avg>=50){
            System.out.println("You got a C+ Grade");
        }
        else if(avg<=50 && avg>45){
            System.out.println("You got a D+ Grade");
        }
        else if(avg<=45 && avg>25 ){
            System.out.println("You got a E+ Grade");
        }
        else if(avg<=25){
            System.out.println("You got a F+ Grade");
        }
        sc.close();
    }
}
