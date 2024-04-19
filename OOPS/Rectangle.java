package OOPS;

// import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Rectangle_Cal obj=new Rectangle_Cal(5.0, 6.0);
        double area=obj.getArea();
        System.out.println("Area of Rectangle is: "+area);
    }
}
class Shape{
    public double getArea(){
        return 0.0;
    }
    }

class Rectangle_Cal extends Shape{
    double length;
    double breadth;
    public Rectangle_Cal(double l,double b){
        this.length=l;
        this.breadth=b;
    }
    public double getArea(){
        return length*breadth;
    }
}

