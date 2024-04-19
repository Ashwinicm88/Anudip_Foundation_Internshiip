package Constructor;

public class Constructorexp2 {
    public static void main(String[] args) {
        Pet obj=new Pet("Abc",21);
        obj.display();
    
    }
}
        
    
    
class Pet {
    int age;
    String name;
    Pet(String n,int a){
        age=a;
        name=n;
    }
    public void display(){
        System.out.println("Your pet name is:"+name+"\n"+"he is age: "+age);
        System.out.println("Thank You...!!!");
    }
}
