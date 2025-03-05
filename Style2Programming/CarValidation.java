package Style2Programming;

public class CarValidation {
	
	public static boolean validateName(String carName) 
	{
		if (carName.length()>=5 && carName.charAt(carName.length()-1) == 'r')
			return true;
		else
			return false;
	}
	
	public static boolean validateNum(String carNum) 
	{
		int condition1status = 0;
		int condition2status = 1;
		int condition3status = 0;
		
		// condition 1
		
		String[] s= carNum.split("-");
		if (s[0].equals("TN")) 
			condition1status =1;
		
		//condition 2
		
		for (int i = 0; i < s[1].length(); i++) {
			if (!Character.isAlphabetic(s[1].charAt(i)) || s[1].length()!=2)
				condition2status = 0;
		}
		//condition 3
		int n = Integer.parseInt(s[2]);
		int count =0;
		while (n!=0) {
			count++;
			n/=10;
		}
		if (count==4) 
			condition3status = 1;
		//final condition
		if (condition1status==1&&condition2status==1&&condition3status==1)
			return true;
		
		else
			return false;
	}
	
	public static boolean priceValidation(long carPrice) {
		if (carPrice>=300000 && carPrice<=10000000) 
			return true;
		else 
			return false;
	}
	
	public static boolean fuelValidation(String fuelType) {
		if (fuelType.equalsIgnoreCase("Petrol") ||fuelType.equalsIgnoreCase("Diesel") ||fuelType.equalsIgnoreCase("Electric")) 
			return true;
		else
			return false;
		}
	
	public static boolean mileageValidation(String fuelType,int carMileage) {
		if ((fuelType.equalsIgnoreCase("Petrol")||fuelType.equalsIgnoreCase("Diesel"))&&(carMileage>=10&&carMileage<=40))
			return true;
		if ((fuelType.equalsIgnoreCase("Electric")&&(carMileage>=100&&carMileage<=600)))
				return true;
		else
			return false;
	}
}



