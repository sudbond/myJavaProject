package com.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	int price;

	Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class SortingArraylistLE {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1,"Dell Laptop",55000));
		list.add(new Product(2,"HCL Laptop",25000));
		list.add(new Product(3,"Asus Laptop",65000));
		list.add(new Product(4,"HP Laptop",45000));
		
		//Sorting using Lambda
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		for(Product p:list) {
			System.out.println(p.id+" "+p.name+" "+p.price);
		}

	}

}
