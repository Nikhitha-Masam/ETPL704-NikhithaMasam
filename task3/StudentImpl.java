package com.evergent.corejava.nikhitha.task3;
 

import java.util.HashSet;
import java.util.Set;

public class StudentImpl implements StudentInterface {
	Set<Student> studentSet=null;
	public StudentImpl() {
		studentSet=new HashSet<Student>();
	}
	
	@Override
	public String addStudent(Student s) {
		studentSet.add(s);
		return s.getSid();
	} 

	@Override
	public void searchBySid(String sid) {
		boolean b=false;
		if(studentSet.size()>0 && studentSet!=null){
			for(Student student:studentSet){
				if(student.getSid().equals(sid)){
					System.out.println(student.getSid()+" "+student.getStudentName()+" "+student.getMarks()+" "+student.getGrade());	
					b=true;
					break;	
				}
			}
		}
		if(!b)
			System.out.println("The student  not found");
			
	}

	@Override
	public void  getAllStudentDetails() {
			if(studentSet.size()>0){
				for(Student student:studentSet){
					System.out.println(student.getSid()+" "+student.getStudentName()+" "+student.getMarks()+" "+student.getGrade());
				}
					
			}else{
				System.out.println("No books are available");
			}
	}

}

