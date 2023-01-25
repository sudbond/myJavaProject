package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

	public static void main(String[] args) {
	ArrayList<Integer> marks = new ArrayList<>();
	marks.add(0);
	marks.add(5);
	marks.add(10);
	marks.add(15);
	marks.add(20);
	marks.add(25);
	
	System.out.println("Original marks");
	System.out.println(marks);
	
	//mapping 
	//adding 5 marks to every student marks
	//for some business logic, we should for mapping
	//Map will take Function(function interface) as argument
	//In mapping, for every element, we generate a new element
	List<Integer> failedStudentMarks = marks.stream().map(i->i+5).collect(Collectors.toList());
	
	System.out.println("Updated marks");
	//Printing list of updated marks on console
	System.out.println(failedStudentMarks);

	}

}
