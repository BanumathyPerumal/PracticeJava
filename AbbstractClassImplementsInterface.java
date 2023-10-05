package javaproject.Inheritance;

public class AbbstractClassImplementsInterface extends Dog {
    public AbbstractClassImplementsInterface(){
        super();
    }
    void sound(){
        System.out.println("Dog barks");
    }
    // void method1(){ // gives compile error
    //     System.out.println("child class method1");
    // }
    public static void main(String[] args) {        
       AbbstractClassImplementsInterface dog = new AbbstractClassImplementsInterface();       
       dog.sound();
       System.out.println(dog.isMammal());
       dog.foodhabit();
       dog.lifetime();
    }
    
}
interface Animal{
    void foodhabit();
    void lifetime();
    boolean isMammal();
    
}

abstract class Dog implements Animal{
    public Dog(){
        System.out.println("Constructor of abstract class Dog");
    }
    public void lifetime(){
        System.out.println("12 - 15 years");
    }
    public boolean isMammal(){
        System.out.println("Dog is a mammal");
        return true;
    } 
    public void foodhabit(){
        System.out.println("carnivores");
    }
    abstract void sound();
    final void method1(){
        System.out.println("final method");
    }
}