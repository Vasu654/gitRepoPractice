package javaBasicsPractice;

public class LocalGlobal {
	static int i=20;
	static boolean b=true;
	static float f=30.0f;
	static long l=63938l;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i=20;
//		boolean b=true;
//		float f=30.0f;
//		long l=63938l;
		
//		System.out.println("int value is " +i);
//		System.out.println("boolean value is " +b);
//		System.out.println("float value is " +f);
       	System.out.println("long value is " +l);
		 firstmethod();
		 secondmethod();

	}
    public static void  firstmethod(){
	
	System.out.println("int value is " +i);
	System.out.println("boolean value is " +b);
	System.out.println("float value is " +f);
	System.out.println("long value is " +l);
}
    
    public static void secondmethod() {
    	System.out.println("----------");
    	System.out.println("int value is " +i);
    	System.out.println("boolean value is " +b);
    	System.out.println("float value is " +f);
    	System.out.println("long value is " +l);
    }
    	
    
}
