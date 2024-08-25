package com.evergent.corejava.constructor;

public class Employee5 {
	int eno;
	String ename;
	double sal;
	Employee5(){
		System.out.println("default constructor");
	}
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno,String ename,double sal){
		this(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Eno:"+eno);
		System.out.println("Ename:"+ename);
		System.out.println("salary:"+sal);
	}
	public static void main(String[] args) {
		new Employee5();
		Employee5 emp5=new Employee5(123,"raj",25000);
		emp5.display();

	}

}
