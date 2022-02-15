package org.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		
		System.out.println(date);
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
		
		String data = dateformat.format(date);
		
		
		
		System.out.println(data);
		
		
	}

}
