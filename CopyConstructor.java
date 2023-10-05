package javaproject;

public class CopyConstructor {
    CopyConstructor(CopyConstructor cc){
        m1();
        System.out.println("Constructor");
    }
    void m1(){
        m2();
        System.out.println("Instance method");
    }
    static void m2(){
        System.out.println("Static method");
    }
     public static void main(String[] args) {
        new CopyConstructor(null);
     }
    
}
