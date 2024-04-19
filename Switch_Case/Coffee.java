package Switch_Case;
import java.util.*;
public class Coffee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("****Menu Card****");
        System.out.println("1.Cortado"+"\n"+"2.Iced Coffee"+"\n"+"3.Affogato"+"\n"+"4.Irish Coffee"+"\n"+"5.Doppio");
        System.out.println("Enter a number to get a Coffee Price from 1 to 5");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                int cortadoPrice=50; 
                System.out.println("Cortado Coffee Price: "+cortadoPrice);
                break;
            case 2:
                int icedPrice=100; 
                System.out.println("Iced Coffee Price: "+icedPrice);
                break;
            case 3:
                int affogatoP=200; 
                System.out.println("Affogato Coffee Price: "+affogatoP);
                break;
            case 4:
                int irrishP=150; 
                System.out.println("Irrish Coffee Price: "+irrishP);
                break;
            case 5:
                int doppioP=200; 
                System.out.println("Doppio Coffee Price: "+doppioP);
                break;
            default:
                System.out.println("Ivalid Choice");
        }
        sc.close();
    }
}
