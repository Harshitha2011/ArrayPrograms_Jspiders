package Style2Programming;

public class Employee {

	private String empName;
	private String empId;
	private double empSal;
	
	public void employeeDetails(String empName,String empId,double empSal) {
		if (EmployeeValidation.empNameValidation(empName))
			this.empName = empName;
		else
			System.err.println("Invalid employee name");
		
		if (EmployeeValidation.empIdValidation(empId))
			this.empId = empId;
		else
			System.err.println("Invalid employee id..");
		
		if (EmployeeValidation.empSalValidation(empSal))
			this.empSal = empSal;
		else
			System.err.println("Invalid Salary ..");
	}
	
	public double annualSalary() {
		return empSal*12;
	}
	
	public void viewDetails() {
		System.out.println("Mr/Ms/Mrs "+empName+" with employee Id "+empId+" is earning a salary of "+empSal+"/- per month and "+annualSalary()+"/- annually");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
	}
}
