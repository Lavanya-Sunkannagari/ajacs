package com.oops;

class Vehicle {
	String make;
	String model;
	int year;
	Vehicle(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void start() {
		System.out.println("Start the vehicle");
	}
	public void stop() {
		System.out.println("Stop the vehicle");
	}
}
class Car extends Vehicle{
	int numDoors;
	Car(String make,String model,int year,int numDoors){
		super(make,model,year);
		this.numDoors=numDoors;
	}
	public void drive() {
		System.out.println("Drive the car");
	}
	public static void main(String[] args) {
		Vehicle v=new Vehicle("Honda","Civic",2023);
		Car c=new Car("Audi","A3",2023,4);
		v.start();
		v.stop();
		c.start();
		c.stop();
		c.drive();
	}
}
