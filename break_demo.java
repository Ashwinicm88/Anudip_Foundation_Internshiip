
import java.util.*;
public class break_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        for(int i=1;i<=10;i++){
            System.out.println("Enter a number: ");
            num=sc.nextInt();
            if(num%7==0){
                break;
            }
            else{
                continue;
            }
        }
        sc.close();
    }
}
