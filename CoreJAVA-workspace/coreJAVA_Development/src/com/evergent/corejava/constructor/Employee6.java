package com.evergent.corejava.constructor;
class MyEmployee{
	int eno;
	public MyEmployee() {
		
	}
	public MyEmployee(int eno) {
		System.out.println("Eno:"+eno);
	}
}
public class Employee6 extends MyEmployee {
	String ename;
	double sal;
	Employee6(){
		System.out.println("default constructor");
	}
	Employee6(int eno,String ename,double sal){
		super(eno);
		this.ename=ename;
		this.sal=sal;
	}
	

	public void display() {
		 
		System.out.println("Ename:"+ename);
		System.out.println("salary:"+sal);
	}
	public static void main(String[] args) {
		new Employee6();
		Employee6 emp6=new Employee6(123,"raj",25000);
		emp6.display();

	}

}
