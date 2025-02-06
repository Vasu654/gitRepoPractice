package javaOOPconcept;

public class carsoverridingchild  extends carsoverridingparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		carsoverridingchild childobj=new carsoverridingchild();
//		childobj.enginestart(4);
//		
//		carsoverridingparent parentobj=new carsoverridingparent();
//		parentobj.enginestart(6);
//		
		carsoverridingparent childparentobj=new carsoverridingchild();
		childparentobj.enginestart(6);
		
	}

	public void enginestart(int cy) {
		super.enginestart(cy);
		System.out.println("I am the CHILD class with cly"+cy);
	
}
}