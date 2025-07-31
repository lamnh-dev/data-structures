package com.lamdev.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		SortedSet<String> fruits = new TreeSet<String>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		
		System.out.println("Fruit Set : " + fruits);
		
		fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);
        
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);
	}

}
