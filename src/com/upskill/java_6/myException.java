package com.upskill.java_6;

public class myException extends Exception { //This exception class came from java default

	String a;                                //
	public myException(String b){
		a=b;
	}
	public String demo(){
		return a;
	}
}
