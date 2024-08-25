package com.evergent.corejava.javabeans;
import java.io.Serializable;
public class EmployeeBean implements Serializable {
	private int eno;
	private String ename;
	private double sal;
	//setters
	public void setEno(int eno) {
		this.eno = eno;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	//getters
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public double getSal() {
		return sal;
	}
	
	
}
