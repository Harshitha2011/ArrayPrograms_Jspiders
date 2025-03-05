package Style2Programming;

public class Student {
	
	private static String school = "APSG";
	private String name;
	private int studentId;
	private double percentage;
	
	public void studentDetails(String name,int studentId,double percentage)
	{
		boolean nameValidate = StudentValidation.nameValidation(name);
		if (nameValidate)
			this.name = name;
		else
			System.err.println("Enter valid name - should contain 4 characters & must begin with a capital letter");
		
		boolean idValidate = StudentValidation.idValidation(studentId);
		if (idValidate) 
			this.studentId = studentId;
		else
			System.err.println("Invalid studen id...");
		
		if (StudentValidation.percentageValidation(percentage)) 
			this.percentage = percentage;
		else
			System.err.println("Invalid Percentage...");
	}
	
	public double toCgpa()
	{
		return (percentage/9.5);
	}
	
	public void viewStudentDetails()
	{
		System.out.println("-------Student details are-------");
		System.out.println("School name :"+school);
		System.out.println("Student name is :"+name);
		System.out.println("Student id :"+studentId);
		System.out.println("CGPA:"+toCgpa());
		
	}
	
	

}
