package com.java.stream;

import java.util.ArrayList;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();
		
		marks.add(54);
		marks.add(45);
		marks.add(16);
		marks.add(32);
		marks.add(22);
		marks.add(76);
		marks.add(98);
		marks.add(40);
		
		//counting total no of failed students;
		long noOfFailedStudents = marks.stream().filter(i->i<35).count();
		
		System.out.println("Total number of failed students are :"+noOfFailedStudents);
		
		

	}

}
