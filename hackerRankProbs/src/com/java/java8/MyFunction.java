package com.java.java8;

import java.io.IOException;
import java.io.OutputStream;
@FunctionalInterface
public interface MyFunction {
	
	public void apply(String text1, String text2);
	
	default public void printUtf8To( String text, OutputStream outputstream ){
		
		try{
			outputstream.write(text.getBytes("charsetName:UTF-8"));
			
		}catch(IOException ex){
			throw new RuntimeException("Error writing string in UTF outputstream");
			
		}
		
	}
	
	static void printToSystemOut(String text){
		System.out.println(text);
	}

}
