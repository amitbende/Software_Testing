package Interface;

public interface Version_8 {
    //Version 1.8/1.9 Enhancement
	   //Java Version 1.8-->default method + static Method
	   // Java Version 1.9-->private method
	
	void m1();  //abstract public void m1(); 
	
	public void m2();  //abstract public void m2();
	
	abstract void m3();  //abstract public void m3();
	
	abstract public void m4();  //abstract public void m4();
	
	
	//Default Method
	default void m5() 
	{
		System.out.println("Hi");
	}
	
	//Static regular Method
	public static void m6()
	{
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args)
	{
		
		m6();
	}
	
	private void m7() 
	{
		System.out.println("Good Afternoon");
	}
	

}
