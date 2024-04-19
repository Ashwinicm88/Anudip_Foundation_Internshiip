package OOPS;

public class Iphone {
    public static void main(String[] args) {
       Iphone8 obj=new Iphone8();
       obj.makeCalls();
       obj.supportHDimf();
       obj.allFeatures(); 
    }
}
/**
 * InnerIphone
 */
 class Iphone6 {
void makeCalls(){
    System.out.println("You can Make calls...!!!");
}
    
}
 class Iphone7 extends Iphone6{
    void supportHDimf(){
        System.out.println("You can click HD images...!!!");
    }
}
 class Iphone8 extends Iphone7{
    void allFeatures(){
        System.out.println("You have all features with 5G support");
    }
}