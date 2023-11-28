package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MLA {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Training");
		
		Matcher m = pattern.matcher("TrainingJava.fsd");
		
		while (m.find())
			
			System.out.println("Patter found from " + m.start() +"to" +(m.end() - 1));
		

	}

}
