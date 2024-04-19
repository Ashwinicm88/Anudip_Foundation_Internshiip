package Switch_Case;
import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character to vowel or not: ");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println(ch+" it is vowel");
                break;
            case 'e':
                System.out.println(ch+" it is vowel");
                break;
            case 'i':
                System.out.println(ch+" it is vowel");
                break;
            case 'o':
                System.out.println(ch+" it is vowel");
                break;
            case 'u':
                System.out.println(ch+" it is vowel");
                break;
            case 'A':
                System.out.println(ch+" it is vowel");
                break;
            case 'I':
                System.out.println(ch+" it is vowel");
                break;
            case 'E':
                System.out.println(ch+" it is vowel");
                break;
            case 'O':
                System.out.println(ch+" it is vowel");
                break;
            case 'U':
                System.out.println(ch+" it is vowel");
                break;
            default:
                System.out.println(ch+" it is consent");
                break;
        }

        sc.close();
    }
}
