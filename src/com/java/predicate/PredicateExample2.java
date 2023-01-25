package com.java.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String name;
	int salary;

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class PredicateExample2 {

	public static void main(String[] args) {

		// creating an ArrayList
		List<Employee> list = new ArrayList<>();

		// adding element to the list

		list.add(new Employee("Jaya", 6000));
		list.add(new Employee("Naga", 2000));
		list.add(new Employee("Shreya", 8000));
		list.add(new Employee("Rama", 4000));
		list.add(new Employee("Shiva", 2000));

		// Writing predicate to find the person having salary more than 3000

		Predicate<Employee> p = e -> e.salary > 3000;

		System.out.println("Employees having salary more than 3000 are : ");

		int count = 0;

		for (Employee e : list) {
			if (p.test(e)) {
				count += 1;
				System.out.println(e.name + " " + e.salary);
			}
		}
		System.out.println("Total employees having salary more than 3000 = " + count);

	}

}
