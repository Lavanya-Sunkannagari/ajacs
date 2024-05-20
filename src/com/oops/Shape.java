package com.oops;

public interface Shape{
	double calculateArea();
	double calculatePerimeter();
}
class Circle implements Shape{
	private int r;
	public Circle(int r){
		this.r=r;	
	}
	public double calculateArea() {
		return Math.PI*r*r;
	}
	public double calculatePerimeter() {
		return 2*Math.PI*r;
	}
}
class Rectangle implements Shape{
	private int l;
	private int b;
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public double calculateArea() {
		return l*b;
	}
	public double calculatePerimeter() {
		return 2*(l+b);
	}
}
class Triangle implements Shape{
	private int b;
	private int h;
	private int s1;
	private int s2;
	private int s3;
	Triangle(int b,int h,int a,int c,int d){
		this.b=b;
		this.h=h;
		this.s1=a;
		this.s2=c;
		this.s3=d;
	}
	public double calculateArea() {
		return 0.5*b*h;
	}
	public double calculatePerimeter() {
		return s1+s2+s3;
	}
}
class Area{
	public static void main(String[] args) {
		Circle c=new Circle(4);
		Rectangle r=new Rectangle(4,5);
		Triangle t=new Triangle(6,5,9,4,3);
		System.out.println(c.calculateArea());
		System.out.println(c.calculatePerimeter());
		System.out.println(r.calculateArea());
		System.out.println(r.calculatePerimeter());
		System.out.println(t.calculateArea());
		System.out.println(t.calculatePerimeter());
		
	}
}