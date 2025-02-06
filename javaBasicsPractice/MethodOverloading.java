package javaBasicsPractice;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=addnum(3,5);
		System.out.println(sum);
		
		double sum1=addnum(6,5.5);
		System.out.println(sum1);
		
		float sum2=addnum(3,6.6f);
		System.out.println(sum2);
		
	}
	
	
	
	static int addnum(int x,int y) {
		return(x+y);
	}
	static double addnum(double x,double y) {
		return(x+y);
	}
	
	static float addnum(int x, float y) {
		return x+y;
	}
		
	

}
