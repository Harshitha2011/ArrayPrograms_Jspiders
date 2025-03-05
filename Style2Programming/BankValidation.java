package Style2Programming;

public class BankValidation {
	
	private static long[] accNums = new long[100];
	private static int index = 0;
	
	public static boolean accHolderNameValidation(String accHolderName)
	{
		int condition1status = 0;
		int condition2status = 0;
		for (int i = 0; i < accHolderName.length(); i++) 
		{
			if (Character.isAlphabetic(accHolderName.charAt(i))) 
				condition1status =1;
		}
		
		if (accHolderName.charAt(0)=='A' || accHolderName.charAt(0)=='S')
			condition2status = 1;
		
		if (condition1status == 1 && condition2status == 1) 
			return true;
		else
			return false;
	}
	
	public static boolean accNumValidation(long accNum)
	{
		int condition1status = 0;
		int condition2status = 0;
		int count = 0;
		long temp = accNum;
		while (temp!=0)
		{
			count++;
			temp/=10;
		}
		if (count==10)
			condition1status = 1;
		boolean isUnique = true;
		for (int i = 0; i < accNums.length; i++) 
		{	
			if (accNums[i]==accNum) 
			{
				isUnique = false;
				break;
			}	
		}
		if (isUnique) 
		{
			accNums[index]=accNum;
			index++;
			condition2status = 1;
		}
		if (condition1status == 1 && condition2status == 1)
			return true;
		else 
			return false;
	}
	
	public static boolean accBalValidation(double accBal) {
		if (accBal>=1000 && accBal <=1000000)
			return true;
		else
			return false;
	}
	
	public static boolean accTypeValidation(String accType) {
		if (accType.equalsIgnoreCase("Savings") || accType.equalsIgnoreCase("Current"))
			return true;
		else 
			return false;
	}
	
	public static boolean ifscCodeValidation(String ifscCode) {
		int condition1status = 1;
		int condition2status = 1;
		for (int i = 0; i < 4; i++) {
			if (!Character.isAlphabetic(ifscCode.charAt(i)))
				condition1status = 0;
		}
		for (int i = 4; i < 8; i++) {
			if (!Character.isDigit(ifscCode.charAt(i)))
				condition2status = 0;
		}
		if (condition1status == 1 && condition2status == 1)
			return true;
		else 
			return false;
	}
}
