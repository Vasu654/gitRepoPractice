package javaBasicsPractice;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Welcome to Java");
		Welcomemesg();
		Welcomemesg();
		WelcomemesgwithParameters("Ruby",3);
		
	   int myRandomnumber=getRandomnumber();
		System.out.println("New user name is -" +myRandomnumber);
		
		int myRandomnumber1=getRandomnumber();
		System.out.println("New user name is -" +myRandomnumber1);
	}
	
	 static void Welcomemesg() {

	System.out.println("Welcome to Java");
	}
	 
	 static void WelcomemesgwithParameters(String langname, int booknumber ) {

			System.out.println("Welcome to " +langname +"Language.Number of books is "+booknumber);
			}
	 
	 static int getRandomnumber() {
		return (int)( Math.random()*101);
	 }
	 

}

