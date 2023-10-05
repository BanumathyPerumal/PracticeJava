package javaproject.Inheritance;

public class MultipleInheritance extends C implements A, B{
    @Override public void print(){
        System.out.println("Printing from the child class");
        A.super.print();  //Invoke A's implementation
        B.super.print();  //Invoke B's implementation
        super.print();    //Invoke C's implementation
    }
    public static void main(String[] args) {
        new MultipleInheritance().print();
    }
 
}
interface A{
    default void print(){
        System.out.println("Printing from Interface A");
    }
}

interface B{
    default void print(){
        System.out.println("Printing from Interface B");
    }
}
class C{
    void print(){
        System.out.println("Printing from class C");
    }
}
