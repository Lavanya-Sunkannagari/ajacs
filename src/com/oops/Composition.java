package com.oops;

class Engine {
	 int horsepower=140;
	 String fueltype="petrol";
	 public void start() {
		 System.out.println("start the engine");
	 }
	 public void stop() {
		 System.out.println("stop the engine");
	 }
	}
class Cars{
		Engine e;
		Cars(Engine e){
			this.e=e;
		}
		public void start() {
			e.start();
			System.out.println("car started");
		}
		public void stop() {
			e.stop();
			System.out.println();
		}
}
public class Composition{
		public static void main(String[] args) {
			Engine e=new Engine();
			Cars c=new Cars(e);
			c.start();
			c.stop();
		}
	}