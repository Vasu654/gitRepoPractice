package javaOOPconcept;

public class Constructors {
	//attributes should be outside the main
	String make ;
	int gear;
	int speed;
	
	public Constructors() {
		
		this.gear=0;
		this.speed=0;
		System.out.println("I am inside the constructor with no parameters");
	}

   public Constructors(int gear, int speed) {
		
		this.gear=0;
		this.speed=0;
		System.out.println("I am inside the constructor with no parameters");
	}

   
   public int getspeed() {
	   
	   return this.speed;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Constructors bmw=new Constructors();
   int carspeed= bmw.getspeed();
   // constructor method will execute automatically
   System.out.println("car speed is " +carspeed);
   
   
   Constructors audi=new Constructors(1,5);
   int audicarspeed=audi.getspeed();
   
   System.out.println("car speed is "+ audicarspeed);
   
	}

}
