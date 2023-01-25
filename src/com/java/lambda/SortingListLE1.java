package com.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	int eno;
	String name;
	Employee(int eno, String name){
		this.eno = eno;
		this.name = name;
	}
}

public class SortingListLE1 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		//adding element to the list
		list.add(new Employee(872425,"Java"));
		list.add(new Employee(212345,"Invent"));
		list.add(new Employee(111213,"Blog"));
		
		System.out.println("Before Sorting the list is : ");
		
		for(Employee e:list) {
			System.out.println(e.eno+" "+e.name);
		}
		
		//Sorting using lambda Expression
		
		Collections.sort(list,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		
		System.out.println("After Sorting the list is : ");
		
		for(Employee e:list) {
			System.out.println(e.eno+" "+e.name);
		}
		
	}
	

}
