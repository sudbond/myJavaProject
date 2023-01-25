package com.java.biFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Employee {
	int eno;
	String name;

	Employee(int eno, String name) {
		this.eno = eno;
		this.name = name;
	}
}

public class BiFunctionEx {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();

		// writing BiFunction
		BiFunction<Integer, String, Employee> b = (eno, name) -> {
			return new Employee(eno, name);
		};

		// adding element to the list
		list.add(b.apply(1, "Abrahim"));
		list.add(b.apply(2, "Lincon"));
		list.add(b.apply(3, "Peter"));
		list.add(b.apply(4, "Parket"));

		// writing a consumer
		Consumer<Employee> c = i -> {
			System.out.println(i.eno + " " + i.name);
		};

		// printing content of list on console
		list.stream().forEach(c);

		// can also be written as
		list.stream().forEach(i -> {
			System.out.println(i.eno + " " + i.name);
		});
	}

}
