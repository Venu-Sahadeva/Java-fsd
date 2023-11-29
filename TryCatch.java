package com;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
				int result = 100/0;
			System.out.println("Result is "+result);
			System.out.println("No Exception");
		} catch (Exception e) {
			System.out.println("Catch block");
		}
	}
	
}

