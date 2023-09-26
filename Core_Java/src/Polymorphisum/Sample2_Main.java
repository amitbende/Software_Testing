package Polymorphisum;

public class Sample2_Main {
	public static void main(String[] args)
	{
		
		//Create Object of Son Class
		
		       Son1 S1=new Son1();
		       S1.Car();
		       S1.Home();
		       S1.Money();
		       Son1.Gold();
		       
		  //Create object of Father Class     
		       
		       Father1 F1=new Father1();
		       F1.Car();
		       F1.Money();
		       F1.Home();
//		       F1.Diomand();
		       Father1.Gold();
		
	}
}
