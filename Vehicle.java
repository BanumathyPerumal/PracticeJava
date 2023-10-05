package javaproject;

public class Vehicle{

	protected String color ="black";
	
	Vehicle(String color){
		this.color="green";
	}
}

class Car extends Vehicle{

	int maxPassengers;
	
	Car(int maxPassengers, String color){
	
		super("blue");
		this.maxPassengers = maxPassengers;
	}
	
	public static void main(String[] args){
	
		Car car = new Car(6,"red");
		System.out.println(car.color);
	}	
}