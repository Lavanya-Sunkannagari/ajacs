package com.oops;

public class Employee {
	private int id;
	private String name;
	private int salary;
	Employee(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name=name;
	}
	public int getSal() {
		return salary;
	}
	public void setSal(int salary) {
		this.salary=salary;
	}
}
class Details{
	public static void main(String[] args) {
		Employee e=new Employee(101,"lavs",50000);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSal());
		e.setId(1);
		e.setName("Lavanya Reddy");
		e.setSal(100000);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSal());
	}
}
