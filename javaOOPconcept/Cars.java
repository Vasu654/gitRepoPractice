package javaOOPconcept;

public class Cars {
	//state/attributes/variabels
	
	//class is define once and use multiple times
	//private attributes can be used only in this class
	
	private String color;
	private String make;
	private String model;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		
		if(year<1999) {
			this.year = year;
		}else {
			System.out.println("model not available");
		}
					
		}
	

	int year;
	
	
	//Behavior/Functionality
	
	public void increaseSpeed() {
		System.out.println(("Increase the speed"));
		
		
	}
	public void setcolor(String color) {
		
		System.out.println("Setting the color");
		this.color = color;
		
		
	}
	
	public String getcolor() {
		//retrive attribute outside of the method -use "this" keyword
		return this.color;
	}
//	public static void main(String[] args) {
//		
//		//creating the object  for the car class
//		//new is keyword to create the object for the class
//		//classes in same pacage can be accesssed 
//		Cars bmw =new Cars();
//		bmw.increaseSpeed();
//		bmw.setcolor();
//		//all execution happens inside main
//	}
	
	//audi.setMake("Nissan")
}

