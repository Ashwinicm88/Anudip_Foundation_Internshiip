/*
 * Constructors do not have any return type not even void.
 * Constructors gets called automatically when object is created.
 * Constructor is a special method whose name is name as class name.
  Types of Constructor:
  Default constructor
  Parameterized constructor
 */


package Constructor;

public class Constructorexp {
    public static void main(String[] args) {
        new Pet();
    }
        
    }
    
class Pet {
    int age;
    String name;
    Pet(){
        age=21;
        name="abc";
        System.out.println("Your pet name is:"+name+"\n"+"he is age: "+age);
        System.out.println("Thank You...!!!");
    }
}

