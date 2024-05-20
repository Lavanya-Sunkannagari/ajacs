package com.oops;

public class Parent {
	void display() {
		System.out.println("Parent method");
	}
}
class Child extends Parent{
	public void display() {
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		Child c=new Child();
		Parent p1=new Child();
		p.display();
		c.display();
		p1.display();
	}
}
