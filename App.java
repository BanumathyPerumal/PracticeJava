/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaproject;
import java.util.List;
import java.util.Set;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Addition addData = new Addition();
        // addData.add(10, 15);
        // addData.add(12.5, 22.8);
        addData.add("spider", "man");
        // System.out.println(addData.add(20,30,50));      
        // addData.map();
    }
}