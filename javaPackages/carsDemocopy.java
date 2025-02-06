package javaPackages;

import javaOOPconcept.Cars;

public class carsDemocopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars audiCar=new Cars();
		
		audiCar.increaseSpeed();
		audiCar.setColor("Blue");
		String carColor=audiCar.getColor();
		System.out.println("car color is " +carColor);
		
		audiCar.setMake("Nissan");
		System.out.println("make is "+audiCar.getMake());
		
		audiCar.setYear(2000);
		System.out.println("year is "+audiCar.getYear());
		
		Cars bmw=new Cars();
		bmw.getcolor();
		

	}

}

