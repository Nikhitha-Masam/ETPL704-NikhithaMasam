package com.evergent.corejava.nikhitha.casestudy3;
import java.util.*;
public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Employee> map=new HashMap<>();
		//add 
		map.put(10,new Employee("ramu","cse"));
		map.put(20,new Employee("ravi","mse"));
		map.put(30,new Employee("raju","dse"));
		
		//list all employees
				for(Map.Entry<Integer,Employee> entry:map.entrySet()) {
					System.out.println("ID: "+entry.getKey()+" value: "+entry.getValue());
				}
		
		//retrieve by id
		System.out.println("Enter id to retrieve");
		int id=sc.nextInt();
		 if(map.containsKey(id)) {
			 System.out.println("Details: "+map.get(id));
		 }
		 else {
			 System.out.println("id not found");
		 }
		 
		 //remove by id
		 System.out.println("Enter id to remove");
		 int id1=sc.nextInt();
		 if(map.containsKey(id1)) {
			 map.remove(id1);
			 System.out.println("removed..");
		 }
		 else {
			 System.out.println("id not found");
		 }
		 
		//list all employees
			for(Map.Entry<Integer,Employee> entry:map.entrySet()) {
				System.out.println("ID: "+entry.getKey()+" value: "+entry.getValue());
			}
		 
		 //update by id
		 System.out.println("enter id to update");
		 int id2=sc.nextInt();
		 if(map.containsKey(id2)) {
			 Employee employee=map.get(id2);
			 
			 System.out.println("enter new name to update");
			 String newName=sc.next();
			 System.out.println("enter new dept to update");
			 String newDept=sc.next();
			 employee.setEname(newName);
			 employee.setEdept(newDept);
			 map.put(id2, employee);
			 
			 System.out.println("Employee updated..");
		 }
		 
		 
		
		//list all employees
		for(Map.Entry<Integer,Employee> entry:map.entrySet()) {
			System.out.println("ID: "+entry.getKey()+" value: "+entry.getValue());
		}
		
		
	}

}
