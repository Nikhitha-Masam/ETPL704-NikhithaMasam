package com.evergent.corejava.oops;

public class UserLogin {
	public void loginData() {
		System.out.println("local info");
	}
	public void loginData(String name,String pass) {
		System.out.println("Name:"+name+" Password "+pass);
	}
	public void loginData(String name,String pass,String capcha) {
		System.out.println("Name:"+name+" Password "+pass+" capcha "+capcha);
	}
	public void loginData(int mobile,String uname) {
		System.out.println("Mobile:"+mobile+" Username "+uname);
	}
	 public void show() {
		 System.out.println("local show method");
	 }
	public static void main(String[] args) {
		 UserLogin login=new UserLogin();
		 login.loginData();
		 login.loginData(12345,"pavan");
		 login.loginData("pavan","pavan123");
		 login.loginData("pavan","pavan123","ABC");

	}

}
