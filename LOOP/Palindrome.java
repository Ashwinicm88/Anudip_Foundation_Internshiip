// package JAVA.LOOP;

import java.util.Scanner;

public class Palindrome {
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
        if(reslt==rev){
            System.out.println( reslt+" it is a Palindrome Number. ");
        }
        else{
            System.out.println( reslt+" it is not a Palindrome Number. ");
        }
        sc.close();
    }
    
}

