/*Write a program to enter a letter. Change the case of the unput letter and
 * display the case of input letter and its ASCII code
 * sample input:- b
 * sample output:- B
 * the ascii value is B: 66
 */
import java.util.*;
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch,ch1;
        System.out.println("Enter a character: ");
        ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch)==true){
            ch1=Character.toLowerCase(ch);
            System.out.println("lower case of "+ch+"is: "+ch1);
            System.out.println("The ASCII value is "+(int)ch1);
        }
        else{
            ch1=Character.toUpperCase(ch);
            System.out.println("Upper case of "+ch+"is: "+ch1);
            System.out.println("The ASCII value is "+(int)ch1);
        }
        sc.close();
    }
}
