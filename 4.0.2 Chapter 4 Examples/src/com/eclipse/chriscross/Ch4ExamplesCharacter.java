package com.eclipse.chriscross;

public class Ch4ExamplesCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int letter = 'c';
		System.out.println(letter);
		System.out.println((char)letter);
		letter++;
		System.out.println(letter);
		System.out.println((char)letter);
		char ch=(char)letter;
		if (ch >= 'A' && ch <= 'Z') 
			  System.out.println(ch + " is an uppercase letter"); 
			else if (ch >= 'a' && ch <= 'z') 
			  System.out.println(ch + " is a lowercase letter"); 
			else if (ch >= '0' && ch <= '9') 
			  System.out.println(ch + " is a numeric character"); 

	}

}
