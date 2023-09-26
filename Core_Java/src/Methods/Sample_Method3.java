package Methods;

public class Sample_Method3 {
	
	public static void main(String[] args)
	{
		StudentInfo(101, "Amit Bende", 'A', 75.16f);
		
		StudentInfo(102, "Arpit Bende", 'A', 78.16f);
	}
	
	public static void StudentInfo(int student_rollno, String student_name, 
									char Student_grade, float student_percentage)
	{
		System.out.println("Student Roll :" + student_rollno);
		System.out.println("Student Name :" + student_name);
		System.out.println("Student Grade :" + Student_grade);
		System.out.println("Student Percentage :" + student_percentage + "%");	
	}
}
