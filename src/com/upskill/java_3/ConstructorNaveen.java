package com.upskill.java_3;

public class ConstructorNaveen {   
  // Constructor can be overloaded by parameter 
	String name;
	int age;
	
	public ConstructorNaveen(){       //Default constructor 0 parameterized
		System.out.println("Hello");
	}
	
	public ConstructorNaveen(int i){       //1 parameter
		System.out.println("1 Hello");
		System.out.println(i);
	}
	
	public ConstructorNaveen(int i, int j){       //2 parameter
		System.out.println("2 Hello");
		System.out.println(i+" "+ j);
	}
	
	public ConstructorNaveen(String name, int age){
		this.name= name;   //when initialize global variable = local variable use this.
		this.age= age;    //this.name(global)= name(local)
		
	}
	
	public static void main(String[] args) {
		ConstructorNaveen obj = new ConstructorNaveen();
		ConstructorNaveen obj1 = new ConstructorNaveen(10);
		ConstructorNaveen obj2 = new ConstructorNaveen(10, 20);
		ConstructorNaveen obj3 = new ConstructorNaveen("Fahime" , 20);
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);
	}

}
