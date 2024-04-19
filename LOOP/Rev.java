// package JAVA.LOOP;
import java.util.*;
public class Rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int reslt=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(reslt+" Reverse number is: "+rev);
        sc.close();
    }
}
