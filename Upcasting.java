package javaproject.Inheritance;

public class Upcasting {
    public static void main(String[] args) {
        Parent pc = new Child();
        Parent p = new Parent();
        Child c = new Child();
        pc.method1(); // parent class method
        pc.method2(5); // parent class method
        pc.method3(); // child class method
        pc.staticMethod();
        System.out.println();
        p.method1();
        p.method2(6);
        p.method3();
        p.staticMethod();
        System.out.println();
        c.method1();
        c.method2(7);
        c.method3();
        c.method4(5);
        c.parentMethod3();
        c.staticMethod();
    }
    
}
class Parent{
    int x =10;
    static void staticMethod(){
        System.out.println("Parent's static method");
    }
    public void method1(){
        System.out.println("printing x: "+ x);
    }
    public void method2(int y){
        System.out.println("parent adding y to x: "+ (x+y));
    }
    public void method3(){
        System.out.println("in method 3 of parent class");
    }
}

class Child extends Parent{
    static void staticMethod(){
        System.out.println("child's static method");
    }
    @Override public void method3(){
        System.out.println("square of x from child class: "+ x*x);
    }
    public void method4(int y){
        System.out.println("Product of x and y child: "+x*y);
    }
    void parentMethod3(){
        super.method3();
    }
}
