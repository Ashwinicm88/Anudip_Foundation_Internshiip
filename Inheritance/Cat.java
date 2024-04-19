package Inheritance;
/*Write a Java program to create a class called Animal with a method called makeSound(). 
Create a subclass called Cat that overrides the makeSound() method to bark. */
public class Cat extends Animal {
    public static void main(String[] args) {
        Cat obj=new Cat();
        obj.makeSound();
    }
   @Override
   public void makeSound() {
       System.out.println("meow meow....");
   } 
}
class Animal {
    public void makeSound(){
        System.out.println("Animal Sound is: ");
    }
}

