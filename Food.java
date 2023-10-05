package javaproject;

class Biriyani {
    public void briefDescription(){
        System.out.println("Biriyani");
    }
    public void category(){
        System.out.println("Indian food item");
    } 
    
}
class Ambur_Biriyani extends Biriyani {
    public void briefDescription(){
        System.out.println("Ambur Biriyani");
    }
}

public class Food extends Biriyani{
    public static void main(String[] args){
        Ambur_Biriyani biriyaniObj = new Ambur_Biriyani();
        biriyaniObj.briefDescription();
        biriyaniObj.category();
        System.out.println();

        // Food food = new Food();
        // food.briefDescription();
        // food.category();
    }
}