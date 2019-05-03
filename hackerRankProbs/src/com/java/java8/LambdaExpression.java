package com.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {
	
	
	
	public static void main(String[] args) {
		int a = 5, b = 5;
		 //(a,b) ->  a + b ;
		 System.out.println(a + "==" + b);
		 
		 new Thread(new Runnable() {
			    @Override
			    public void run() {
			        System.out.println("howtodoinjava");
			    }
			}).start();
		 
		 
		 new Thread(
				 () -> {
					 System.out.println("Using lambda");
				 }
		 ).start();
		 
		 //-----------------------
		 List<String> list = new ArrayList<String>();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 list.add("d");
		 
		 for (String ch : list) {
			 System.out.println(ch+"" );
			 
		 }
		 //using lambda
		 list.forEach( p ->  {System.out.println(p+"" );});
		
		 
		 //Compare two object using Lambda Express
		 
		 Comparator<String> stringComparatorLambda = 
				 (o1, o2) -> o1.compareTo(o2);
				 
		 int lambdacomparison = stringComparatorLambda.compare("pravir", "pravir");
		 System.out.println(lambdacomparison);
		 
		 //---------------------------------------------------------------------------
		 
		 MyFunction	myfunctionLambda = ( 
				 (String text1, String text2) -> { System.out.println(text1 + " " + text2); });
		 
		 myfunctionLambda.apply("Pravir", "Ghosh");
		 
		 MyFunction	myfunctionLambda2 = myfunctionLambda;
		 myfunctionLambda2.apply("Kumar", "Ghosh");
		 
		 
	}
	

}
