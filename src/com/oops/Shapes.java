package com.oops;

abstract class Shapes{
	abstract void draw();
	abstract double calculateArea();
}
class Circles extends Shapes{
	private int r;
	Circles(int r){
		this.r=r;
	}
	public void draw() {
		System.out.println("Draw circle");
	}
	public double calculateArea() {
		return Math.PI*r*r;
	}
}
class Rectangles extends Shapes{
	private int l;
	private int b;
	Rectangles(int l,int b){
		this.l=l;
		this.b=b;
	}
	public void draw() {
		System.out.println("Draw Rectangle");
	}
	public double calculateArea() {
		return l*b;
	}
}
class Triangles extends Shapes{
	private int b;
	private int h;
	Triangles(int b,int h){
		this.b=b;
		this.h=h;
	}
	public void draw() {
		System.out.println("Draw Triangle");
	}
	public double calculateArea() {
		return 0.5*b*h;
	}
}
class Abstract{
	public static void main(String[] args) {
		Circles c=new Circles(4);
		Rectangles r=new Rectangles(5,6);
		Triangles t=new Triangles(4,5);
		c.draw();
		System.out.println("Area of Circle is:"+c.calculateArea());
		r.draw();
		System.out.println("Area of Rectanglec:"+r.calculateArea());
		t.draw();
		System.out.println("Area of the Triangle:"+t.calculateArea());
	}
}
