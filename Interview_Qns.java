package javaproject;
public class Interview_Qns {
    static int y = 8;
    int z = 10;
    public static void main(String[] args){
        // Qn 1 o/p? 11 or 12? Ans - 12
        // System.out.println(x++); - o/p = 5
        // System.out.println(++x); - o/p = 6
        int x = 5;
        System.out.println(x++ + ++x);

        // Qn 2 o/p ? true or false? Ans - false
        String str1 = "Java";
        String str2 = new String("Java");
        System.out.println(str1 == str2);

        // Qn 3 - o/p? Base or Derived? Ans - Derived
        Base obj = new Derived();
        obj.print();

        // Qn 4 - can we access instance variable directly from a static method? 
        //Ans, No. We can access static variable directly. 
        //Can access non static variable using an object reference only. 
        //Cannot use this keyword inside a static method.

        System.out.println(y);
        System.out.println(new Interview_Qns().z);
        // Qn 5 - Whats the o/p - Hello World or HelloWorld 
        String s1 = "Hello";
        String s2 = "World";
        String result = s1 + s2;
        System.out.println(result);

        // Qn 6 - whats the o/p? 2.0 or 2.5?  Ans 2.0
        int a = 5;
        int b = 2;
        double res = a / b;
        System.out.println(res);

        // Qn 7 - o/p? Java or Java is fun? Ans - Java
        String str = "Java";
        str.concat(" is fun");
        System.out.println(str);

        // Qn - 8: Reverse the string without any in built functions
        System.out.println(reverse("This is a String"));

        //QN - 9: g=3, g++*8?
        int g=3;
        g= g++*8;
        //System.out.println("qn 9: "+g++*8);
        System.out.println("qn 9: "+g);
    }
    public static String reverse(String input){
        String output = "";
        for(int i=input.length()-1; i>=0; i--){
        output += ""+input.charAt(i);
        }
        return output;
        }
    
}
class Base {
    public void print() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public void print() {
        System.out.println("Derived");
    }
}