package javaBasicsPractice;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//store similar datatype with multiple data 
		
		
		//declare the array-size of array is fixed -static
		int[] myIntArray=new int[6];
		String[] myStringArray=new String[10];
		
		//Stroe the values
//		myIntArray[0]=100;
//		myIntArray[1]=300;
//		myIntArray[2]=400;
//		myIntArray[3]=200;
//		myIntArray[4]=600;
//		
//		myStringArray[0]="vas";
//		myStringArray[0]="udha";
		
		//Retrive the values
		
//		System.out.println("array 0 is" +myIntArray[0]);
//		System.out.println("array 1 is" +myIntArray[1]);
//		System.out.println("array 2 is" +myIntArray[2]);
//		System.out.println("array 5 is" +myIntArray[5]);
//		
//		
//		System.out.println("string 0 is" +myStringArray[2]);
//		System.out.println("string 1 is" +myStringArray[0]);
//		System.out.println("string 2 is" +myStringArray[0]);
//		System.out.println("string 5 is" +myStringArray[1]);
//		
//		//directly store values in array
//		
	String[] myStringnumbers= {"1","2","3"};
	//	System.out.println("numbers are " +myStringnumbers[0]);
//		System.out.println("numbers are " +myStringnumbers[2]);
//		
//		System.out.println("numbers are " +myStringnumbers[1]);
		
		// getting the length of the array
	
	
		int len = myStringnumbers.length;
		
		
		System.out.println(" length is "+len);
		
		
		
		
		//using loops to print
		
		for(int i=0;i<len;i++) {
			
			System.out.println("Array index is " +i +"-" +myStringnumbers[i]);
		}
		
		
		
		
		
		

	}

}
