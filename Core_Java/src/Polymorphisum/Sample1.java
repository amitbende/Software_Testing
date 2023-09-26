package Polymorphisum;

public class Sample1 {
	public static void main(String[] args)
	{
		
		//Create Object of Son Class
		
		       Son S1=new Son();
		       S1.Bike();
		       S1.Car();
		       S1.Home();
		       S1.Money();
		       
		       
		  //Create object of Father Class     
		       
		       Father F1=new Father();
		       F1.Car();
		       F1.Money();
		       F1.Home();
		
	}

}
