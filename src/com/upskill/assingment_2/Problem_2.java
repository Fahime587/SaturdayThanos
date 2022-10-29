package com.upskill.assingment_2;

public class Problem_2 {
 
	static int marks = 78;
	
	public static void main(String[] args) {
		marks();

	}

	public static void marks(){
		if(marks>= 90){
		System.out.println("Grade A");	
		}
	else if(marks>=80 && marks<=89){
		System.out.println("Grade B");
	}
	else if (marks>=70 && marks<=79){
		System.out.println("Grade c");
	}
	else if (marks>=60 && marks<=69){
		System.out.println("Grade D");
	}
	else if (marks<60){
		System.out.println("Fail");
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
