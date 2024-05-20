package com.oops;

public class Animal {
	public void makeSound() {
		System.out.println("Animals make sound");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Bow bow");
	}
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("Meow");
	}
}
class Cow extends Animal{
	public void makeSound() {
		System.out.println("Ambaa");
	}
}
class Sound{
	public static void main(String[] args) {
		Animal[] a= {new Dog(),new Cat(),new Cow()};
		for(Animal i:a) {
			i.makeSound();
		}
	}
}