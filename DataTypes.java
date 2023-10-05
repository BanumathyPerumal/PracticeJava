package javaproject;

public class DataTypes {
    public static void main(String[] args){
        int x = 10;
        System.out.println(x==10);  // try x.equals(10), will throw compilation error. can't invoke equals method on primitive data type.

        Integer y = 10;
        System.out.println(y.equals(10)); //here deferencing(action of accessing object's features through reference ) is allowed as y is an object of Integer class
    }
    
}
