package javaBasicsPractice;

import javaOOPconcept.*;

//'* import all classes from different package 

public class importClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars nissan=new Cars();
		nissan.setcolor("Blue");
	String carcolor=	nissan.getcolor();
	System.out.println("car color is "+carcolor);

	}

}
