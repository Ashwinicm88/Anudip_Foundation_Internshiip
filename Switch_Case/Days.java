/* We use switch for menu driven programming.
 * means user will input a choice based on that particular case will be handled.
 */

package Switch_Case;
import java.util.*;

public class Days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        sc.close();
    }
}
