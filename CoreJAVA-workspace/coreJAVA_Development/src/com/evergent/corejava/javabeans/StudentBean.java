package com.evergent.corejava.javabeans;
import java.io.Serializable;
public class StudentBean implements Serializable {
	private String sname;
	private int sno;
	private String address;
	
	//setters
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//overriding toString() method
	public String toString() {
		return "Student no:"+sno+"\n student name:"+sname+"\n student address:"+address;
	}
	
}
