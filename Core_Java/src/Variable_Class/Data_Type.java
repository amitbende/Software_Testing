package Variable_Class;

public class Data_Type {
	
	public static void main(String[] args)
	{
		// Variable Declaration 
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h;
		boolean i;
		
		String j;
		
		//Variable Initialization
		a = 100;						//-128 to 127
		b=30000;						//-32,768 to 32,767
		c=214785462;					//-2,147,483,648 to 2,147,483,647
		d=2154685665525655665L;			//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		e=10000.581555f;
		f=509.5654588;
		g='C';
		h=true;
		i=false;
		
		j="Amit1995";
		
		//Usage
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		
	}
}
