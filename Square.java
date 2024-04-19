import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a length");
        int length=sc.nextInt();
        System.out.println("Enter a Width");
        int width=sc.nextInt();
        if(length==width){
            System.out.println("It is SQUARE");
        }
        else{
            System.out.println("It is a RECTANGLE");
        }
        sc.close();
    }
}
