package com.java.function;

import java.util.function.Function;

class Student{
	String name;
	int marks;
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
}

public class StudentGradeFunction {

	public static void main(String[] args) {
		
		//Function body starts
		Function<Student, String> f = s->{
			int marks = s.marks;
			String grade = " ";
			if(marks>=80) grade = "A[Dictinction]";
			else if(marks>=60) grade = "B[First Class]";
			else if(marks>=50) grade = "c[Second Class]";
			else if(marks>=35) grade = "D[Third class]";
			else grade = "E[Failed]";
			return grade;
		};
		//Function body ends
		
		//creating an array of students
		Student [] s = {
				new Student("Sud",100),
				new Student("Vij",68),
				new Student("Rama",52),
				new Student("Chinny",49),
				new Student("Vinny",35),
				new Student("Kul",14)
				
		};
		
		for(Student s1:s) {
			System.out.println("Student name : "+s1.name);
			System.out.println("Student name : "+s1.marks);
			System.out.println("Student Grade : "+f.apply(s1));
			System.out.println("-------------------------------------------------");
		}
		
		

	}

}
