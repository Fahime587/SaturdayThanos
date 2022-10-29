package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		//Array
	    //String name= "a";
		String[] nameThanos = new String[]{"a", "b", "c", "d", "e","f"};
	
		
		System.out.println("Student name" + nameThanos[1]);
		System.out.println("Total Student" + nameThanos.length);
		
		//HashMap
		
    HashMap<String, String> country = new HashMap<String, String>();
    country.put("Bangladesh", "Dhaka");
	country.put("U.S.A", "DC");	
		
	System.out.println("capital city:" + country.get("U.S.A"));	
	
	//HashSet
	HashSet<Integer> age2 = new HashSet<Integer>();
	
	age2.add(25);
	age2.add(30);
	age2.add(35);
	System.out.println("Age :" + age2);
	
	
		
	}

}
