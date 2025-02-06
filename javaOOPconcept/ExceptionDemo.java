package javaOOPconcept;

public class ExceptionDemo {
	
	static void checkage(int age) {
		if (age<18) {
			
			throw new ArithmeticException("Access denied,you must be atleats 18 years");
		}
		else
		{
			System.out.println("access granted"+age);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkage(20);
		checkage(10);
		try {
			int[] numbers= {1,2,3};
			System.out.println(numbers[10]);
		}
			catch(Exception e) {
				System.out.println("something went wrong");
						
			}
		finally {
			System.out.println("the try catch finished");
			

		}

	}

}
