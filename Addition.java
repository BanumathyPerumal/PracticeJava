package javaproject;
import java.util.HashMap;
import java.util.Map;

public class Addition {

    public void add(int a, int b){
        System.out.println("Sum of the given integers is: "+ (a+b));
    }

    public void add(double a, double b){
        System.out.println("Sum of given decimal numbers is :"+(a+b));
    }
    public void add(String a, String b){
        System.out.println("Concatenated the given characters..."+ (a+b));  
    //    System.out.println("Hashcode of a: "+ a.hashCode());
    //    String gt = new String("spider");
    //    System.out.println("Hashcode of gt :"+gt.hashCode());
    }    
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public void map(){
        Map<String, Integer> m = new HashMap<String, Integer> ();
        m.put("text1", 18);
        m.put("text2", 2);
        System.out.println(m.put("text1", 3));
        System.out.println(m);
        
    }
}
