package javaproject;
class parent {
    public static void show(){
        System.out.println("Parent class static method");
    }
    public void display(){
        System.out.println("Parent class display method");
    }
}
class child extends parent {
    public static void show(){
        System.out.println("Child class static method");
    }
    public void display(){
        System.out.println("Child class display method");
    }
}
public class StaticMethod {
    public static void main(String[] args){
        parent p = new child();
        p.show();
        p.display();       
    }
    
}
