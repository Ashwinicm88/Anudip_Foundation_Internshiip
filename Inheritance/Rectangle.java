package Inheritance;

public class Rectangle extends Shape{
    public static void main(String[] args) {
        Rectangle obj=new Rectangle(4.2,3.2 );
        System.out.println("The area is: "+obj.getArea());
        double area= obj.getArea();
        System.out.println("The area rectangle is: "+area);
    }
    private double len,breadth;
    public Rectangle(double len,double breadth){
        super();
        this.len=len;
        this.breadth=breadth;
    }
    public double getArea() {
        return this.len*this.breadth;
    }
}

