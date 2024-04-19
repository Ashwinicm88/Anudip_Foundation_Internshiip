// package JAVA;

public class Sounds_overriding {
    public static void main(String[] args) {
        Goat obj=new Goat();
        obj.sound();
    }
    }
 class Dog{
    public void sound(){
        System.out.println("Bow bow...!!");
    }
}

class Cat extends Dog{
public void sound(){
    super.sound();
    System.out.println("Meow Meow...!!");
}
}
class Goat extends Cat{
    public void sound(){
        super.sound();
        System.out.println("Maa Maa...!!");
    }
}


