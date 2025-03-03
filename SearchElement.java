import java.util.Scanner;
class SearchElement 
{

	public static String isPresent(int ele,int[] a)
	{
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]==ele)
			{
				return "Element present";
			}
		}
		return "Element not present";
	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] a= {12,32,2,45,5,31};
		System.out.println("Enter element you want to search : ");
		int ele = sc.nextInt();
		String res = isPresent(ele,a);
		System.out.println(res);
	}
}
