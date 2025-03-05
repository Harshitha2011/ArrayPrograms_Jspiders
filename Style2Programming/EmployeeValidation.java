package Style2Programming;

public class EmployeeValidation {

	public static boolean empNameValidation(String empName) {
		int condition1status = 1;
		int condition2status = 0;
		for (int i = 0; i < empName.length(); i++) {
			if (!Character.isAlphabetic(empName.charAt(i)))
				condition1status = 0;		
		}
		if (Character.isUpperCase(empName.charAt(0)))
			condition2status = 1;
		
		if (condition1status==1 && condition2status ==1)
			return true;
		else 
			return false;
	}
	
	public static boolean empIdValidation(String empId) {
		int condition1status = 0;
		int condition2status = 1;
		if(empId.substring(0, 3).equals("EMP"))
			condition1status = 1;
		
		for (int i = 3; i < 6; i++) {
			if (!Character.isDigit(empId.charAt(i)))
				condition2status =0;
		}
		if (condition1status==1 && condition2status==1)
			return true;
		else
			return false;	
	}
	
	public static boolean empSalValidation(double empSal) {
		if (empSal>=15000 && empSal<=100000)
			return true;
		else 
			return false;
	}
}
