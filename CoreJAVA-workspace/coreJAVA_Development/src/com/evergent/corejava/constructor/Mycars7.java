package com.evergent.corejava.constructor;
class Car{
	String color;
	int maxSpeed;
	Car(){
		color="white";
		maxSpeed=120;
	}
	Car(String color,int maxSpeed){
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void display() {
		System.out.println("Color:"+color);
		System.out.println("MaxSpeed"+maxSpeed);
	}
}
public class Mycars7 {

	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car("Red",150);
		car1.display();
		car2.display();

	}

}
