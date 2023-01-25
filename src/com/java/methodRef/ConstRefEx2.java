package com.java.methodRef;

import java.util.ArrayList;

class Student {
	String name;
	int roll;
	int marks;
	String address;

	Student(String name, int roll, int marks, String address) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
		this.address = address;

	}
	@Override
	public String toString() {
		return name + " " + roll + " " + marks + " " + address;
	}
}

interface ObjInit {
	public Student get(String name, int roll, int marks, String address);
}

public class ConstRefEx2 {

	public static void main(String[] args) {
		ObjInit i = Student::new;

		Student s1 = i.get("John", 1, 54, "London");
		Student s2 = i.get("Vidya", 2, 87, "India");

		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		
		System.out.println(list);

	}

}
