package String_programs;

public class SortingAString {
	
	public static void main(String[] args) {
		String str = "jspiders";
		char[] a = str.toCharArray();
		
		for (int i=0;i<a.length ;i++ )
		{
			for(int j=0;j<a.length-1;j++)
			{
				if (a[j]>a[j+1])
				{
					char temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}			
			}
		}	
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]);
			
		}
	}

}
