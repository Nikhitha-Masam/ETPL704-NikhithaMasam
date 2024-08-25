package com.evergent.corejava.constructor;

public class Employee2 {
	int eno;
	String ename;
	double sal;
	Employee2(){
		System.out.println("default constructor");
	}
	Employee2(int eno1,String ename1,double sal1){
		eno=eno1;
		ename=ename1;
		sal=sal1;
	}
	public void display() {
		System.out.println("Eno:"+eno);
		System.out.println("Ename:"+ename);
		System.out.println("salary:"+sal);
	}
	public static void main(String[] args) {
		 new Employee2();
		 Employee2 emp2=new Employee2(123,"nikhitha",27000);
		 emp2.display();
	}

}
