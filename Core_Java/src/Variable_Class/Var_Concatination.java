package Variable_Class;

public class Var_Concatination {
	
	public static void main(String[] args)
	{
		//data_type variable_name(Memory store allocate in memory)
		String StudentName;    					
		int StudentRollno;
		char StudentGrade;
		float StudentMarks;
		
		//Variable Initialization
		StudentName = "Amit";				//String data_type
		StudentRollno = 11;					//integer data_type
		StudentGrade = 'A';					//char_type data_type
		StudentMarks = 92.1f;				//float data_type
		
		//Usage
		System.out.println("Student Name :"+StudentName);  				//AMIT
		System.out.println("Student Roll Number :"+StudentRollno);		//11
		System.out.println("Student Grade :"+StudentGrade);				//A
		System.out.println("Student Marks :"+StudentMarks + "%");		//92.2
	}

}
