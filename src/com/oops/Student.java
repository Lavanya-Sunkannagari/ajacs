package com.oops;

public class Student {
	int id;
	String name;
	int age;
	Student(){
		System.out.println("No parameters");
	}
	Student(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println("first constructor");
	}
	Student(String name){
		this.name=name;
		System.out.println("second constructor");
	}
	Student(int age,int id){
		this.age=age;
		this.id=id;
		System.out.println("third constructor");
	}
	public static void main(String[] args) {
		Student s=new Student(101,"lavs");
		Student s2=new Student(21,100);
		Student s1=new Student("Lavanya Reddy");
		Student s3=new Student();
	}
}
