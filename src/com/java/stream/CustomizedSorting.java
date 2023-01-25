package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomizedSorting {

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

		System.out.println("Original List");
		System.out.println(marks);
		System.out.println("------------------------------------------------------------");
		
		//default natural sorting order
		// ascending order
		List<Integer> customizedSortedList2 = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("List in Ascending order");
		System.out.println(customizedSortedList2);
		System.out.println("------------------------------------------------------------");
		
		//sorting
		//customized sorting i.e Descending order
		List<Integer> customizedSortedList = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("List in Descending order using minus symbol");
		System.out.println(customizedSortedList);
		System.out.println("------------------------------------------------------------");
		
		//can also be achieved by using minus(-) symbol
		List<Integer> customizedSortedList1 = marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("List in Descending order by interchanging i1 and i2");
		System.out.println(customizedSortedList1);
		System.out.println("------------------------------------------------------------");
	}

}
