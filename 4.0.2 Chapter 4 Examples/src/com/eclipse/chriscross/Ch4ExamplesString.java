package com.eclipse.chriscross;
import java.util.Scanner;

public class Ch4ExamplesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Welcome to Java. This class is awesome!";
		System.out.println("The length of " + message + " is " 
		  + message.length());
		
		System.out.println("The first character in message is " 
				   + message.charAt(0));
		
		System.out.println(message.toUpperCase());
		
		System.out.println(message.toLowerCase());
		
		String newMessage = "Really!";
		
		System.out.println(message + " " + newMessage);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String readMessage = input.next();
		
		System.out.println(newMessage + readMessage);
		System.out.println(newMessage.equals(readMessage));
		
		System.out.println(message.indexOf('o'));
		System.out.println(message.indexOf('o',7));
		System.out.println(message.lastIndexOf('o'));
		System.out.println(message.lastIndexOf('o',7));
	
		String intString = "10";
		int intValue = Integer.parseInt(intString);
		String doubleString = "10.5";
		double doubleValue = Double.parseDouble(doubleString);

		System.out.println(intValue+doubleValue);

		
		


	}

}
