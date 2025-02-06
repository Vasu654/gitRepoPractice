package javaBasicsPractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		//Scanner class  to allow user  to enter input-system.in
		
		Scanner myObj=new Scanner(System.in);
		System.out.println("enter sting to reverse");
		
	String originalText=myObj.nextLine();
	myObj.close();
	
	
	if(originalText.isEmpty()) {
		System.out.println("Empty stings are not allowed");
	}else {
	
	System.out.println("Original text is" +originalText);
	
	
	String reverseText="";
	String[] originalArray=originalText.split(" ");
	
	for(String eachitem: originalArray) {
		System.out.println(eachitem);
		
		reverseText=eachitem + ""+reverseText;
	}
	
System.out.println(reverseText);
	}

	}
	
}