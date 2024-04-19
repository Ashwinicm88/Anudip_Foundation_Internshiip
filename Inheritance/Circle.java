package Inheritance;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public double getArea(){
        return (3.14)*this.radius*this.radius;
    }
    public double getPerimeter(){
        return (2*3.14)*this.radius;
    }
    public static void main(String[] args) {
        Circle obj=new Circle(4.0);
        System.out.println("Area of Circle is: "+obj.getArea());
        System.out.println("Perimeter of Circle is: "+obj.getPerimeter());
    }
   
}

