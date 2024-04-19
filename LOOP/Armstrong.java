

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int result=num;
        while(num>0){
            int rem=num%10;
            rev=(int) (rev+Math.pow(rem,3));
            num/=10;
        }
        if(result==rev){
            System.out.println(result+" It is a Plaindrome Number...!!");
        }
        else{
            System.out.println(result+" It is not a Palindrome Number...!!");
        }
        sc.close();
    }

}
