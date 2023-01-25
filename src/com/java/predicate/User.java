package com.java.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {
	String name, role;

	// Constructor
	User(String name, String role) {
		this.name = name;
		this.role = role;
	}

	// getter for role
	String getRole() {
		return role;
	}

	// getter for name
	String getName() {
		return name;
	}

	// overriding toString method of object class
	@Override
	public String toString() {
		return "User-name : " + name + " " + "User-role : " + role;
	}

	// method to find role of users
	public static List<User> process(List<User> users, Predicate<User> predicate) {
		// creating a list to store the result
		List<User> result = new ArrayList<>();
		// iterating the list users using for each loop
		for (User user : users) {
			if (predicate.test(user)) {
				result.add(user);
			}
		}
		//returning the result list
		return result;

	}

	public static void main(String[] args) {
		// creating a list of user type

		List<User> users = new ArrayList<>();
		// adding elements to the list
		users.add(new User("Java", "admin"));
		users.add(new User("Invent", "Employee"));
		
		//calling the process() method
		List<User> admins = process(users, (User u)->u.getRole().equals("admin"));
		
		//Printing the admins list
		System.out.println(admins);

	}

}
