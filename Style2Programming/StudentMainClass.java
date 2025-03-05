package Style2Programming;

public class StudentMainClass {
	
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.studentDetails("Jack",2341,67.8);
		student2.studentDetails("John", 1234, 98.6);
		
		student1.viewStudentDetails();
		student2.viewStudentDetails();
	}
	

}
