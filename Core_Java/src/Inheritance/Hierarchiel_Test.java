package Inheritance;

public class Hierarchiel_Test {
	
	public static void main(String[] args) 
	{
		//Create Object Of Son1 Class
		Hierarchical_Son1 S1=new Hierarchical_Son1();
		S1.Car();
		S1.Home();
		S1.Money();
		S1.Mobile();
		
		//Create Object Of Son2 Class
		Hierarchical_Son2 S2=new Hierarchical_Son2();
		S2.Bike();
		S2.Car();
		S2.Home();
		S2.Money();
		
		
		//Create Object Of Son3 Class
		Hierarchical_Son3 S3=new Hierarchical_Son3();
		S3.Car();
		S3.Home();
		S3.Money();
		S3.Laptop();
		
	}

}
