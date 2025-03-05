package Style2Programming;

public class EmployeeMainClass {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee1.employeeDetails("Ash", "EMP113", 80000);
		employee2.employeeDetails("Tarun", "EMP511", 100000);
		employee1.viewDetails();
		employee2.viewDetails();
	}
}
