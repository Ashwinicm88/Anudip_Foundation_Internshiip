package Exceptions;

public class Arithmetic {
    public static void main(String[] args) {
        
        try {
           
            int arr[]=new int[5];
            arr[5]=7;
            // int a=5/0;
        } 
        catch (ArrayIndexOutOfBoundsException o) {
           System.out.println(o);
        }
        catch(ArithmeticException a){
            System.out.println(a);
            System.out.println("Can't divide by zero");
        }    
    }
}
