package javaproject.Inheritance;

public class AnonymousBlock {
    
    public static void main(String[] args) {
        C1 c = new C1();
    }
}
class A1
{
    {
        System.out.println(1);
    }
}
 
class B1 extends A1
{
    {
        System.out.println(2);
    }
}
 
class C1 extends B1
{
    {
        System.out.println(3);
    }
}