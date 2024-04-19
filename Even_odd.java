
import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check even or odd");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" it is even number.");
        }
        else{
            System.out.println(num+" it is a odd number");
        }
        sc.close();
    }
}
