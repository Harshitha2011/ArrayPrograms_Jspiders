package Style2Programming;

public class StudentValidation {
	
	private static int[] stdIds = new int[100];
	private static int index = 0;
	public static boolean nameValidation(String name)
	{
		int condition1status = 0;
		int condition2status = 0;
		
		//condition1 logic
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			count++;
		}
		if (count==4) {
			condition1status=1;
		}
		
		//condition2 logic
		char firstCharater = name.charAt(0);
		if (Character.isUpperCase(firstCharater)) {
			condition2status = 1;
		}
		
		//final logic
		if (condition1status == 1 && condition2status == 1) 
			return true;
		else 
			return false;
	}
	
	public static boolean idValidation(int studentId)
	{
		int condition1status = 0;
		int condition2status = 0;
		
		//condition1 logic
		int count = 0;
		int temp = studentId;
		while (temp!=0) {
			count++;
			temp/=10;
		}
		/* if (studentId/1000 >=1 && studentId/1000<=9) 
		{
			condition1status = 1;
		} */
		if (count==4) {
			condition1status=1;
		}
		//condition2 logic
		boolean isUnique = true;
		for (int i = 0; i < stdIds.length; i++) {
			if (studentId == stdIds[i]) 
			{
				isUnique = false;
				break;
			}
		}
		if (isUnique) {
			stdIds[index] = studentId;
			index++;
			condition2status=1;
		}
		
		//final logic 
		if (condition1status == 1 && condition2status ==1  ) {
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean percentageValidation(double percentage) {
		if (percentage>=1 && percentage<=99) 
			return true;
		else
			return false;
	}

}
