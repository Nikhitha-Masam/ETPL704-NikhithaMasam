package com.evergent.corejava.nikhitha.casestudy3;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empId;
	private String ename;
	private String edept;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}	
	public Employee(String ename,String edept) {
		this.ename=ename;
		this.edept=edept;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public void setEdept(String edept) {
		this.edept=edept;
	}
	public String getEname() {
		return ename;
	}
	
	public String getEdept() {
		return edept;
	}
	
	public String toString() {
		return ename+" "+edept;
	}
	 
	
}
