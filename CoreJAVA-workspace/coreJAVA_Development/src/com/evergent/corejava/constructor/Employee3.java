package com.evergent.corejava.constructor;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("default constructor");
	}
	Employee3(int eno,String ename,double sal){
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Eno:"+eno);
		System.out.println("Ename:"+ename);
		System.out.println("salary:"+sal);
	}
	public static void main(String[] args) {
		new Employee3();
		Employee3 emp3=new Employee3(123,"raj",25000);
		emp3.display();

	}

}
