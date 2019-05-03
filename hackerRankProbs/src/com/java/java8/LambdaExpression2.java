package com.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression2 {
	
	static String othervariable = "Ranchi";
	
	private String fourthtext = "Fourthtext";
	
	public void doit(){
		
		final String otherText = "Mr.";
		
		 MyFunction	myfunctionLambda = ( 
				 (String text1, String text2) -> { System.out.println( otherText+ " "+ text1 + " " + text2 + " " + othervariable); });
		 
		 myfunctionLambda.apply("Pravir", "Ghosh");
		 
		 othervariable = " Khunti";
		 
		 myfunctionLambda.apply("Pravir", "Ghosh");
		 
	}
	
	public static void main(String[] args) {	
		
		final String otherText = "Mr.";
		
		 MyFunction	myfunctionLambda = ( 
				 (String text1, String text2) -> { System.out.println( otherText+ " "+ text1 + " " + text2 + " " + othervariable); });
		 
		 myfunctionLambda.apply("Pravir", "Ghosh");
		 
		 othervariable = " Khunti";
		 
		 myfunctionLambda.apply("Pravir", "Ghosh");
		 
		 
	}
	

}
