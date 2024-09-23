package com.evergent.corejava.nikhitha.task3;

 
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Student_task {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentInterface book=(StudentInterface) new StudentImpl();
		for(;;){
			System.out.println("1. Add Student 2.Search by Student id(sid) 3.displayAll 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the sid");
				   String sid=sc.next();
				   System.out.println("Enter the Student name");
				   String name=sc.next();
				   System.out.println("Enter the Marks");
				   double marks=sc.nextDouble();
				   System.out.println("Enter student grade");
				   char grade=sc.next().charAt(0);
				   Student s=new Student();
				   s.setSid(sid);
				   s.setStudentName(name);
				   s.setMarks(marks);
				   s.setGrade(grade);
				   String message=book.addStudent(s);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the sid");
			   	   String sid1=sc.next();
			   	   book.searchBySid(sid1);
			   	   break;
			  			
			case 3:book.getAllStudentDetails();
				break;
			case 4:System.exit(0);
			}
			
		}
	}
}
	

