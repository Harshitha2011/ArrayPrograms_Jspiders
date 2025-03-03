import java.util.Scanner;
class IndexReturn 
{
	public static void isPresent(int ele,int[] a)
	{
		boolean isPresent = false;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]==ele)
			{
				isPresent = true;
			}
			if (isPresent)
			{
				System.out.println("Element is present at index "+i);
				break;
			}
			else
			{
				System.out.println("Element is not present in the array");
				break;
			}
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] a= {12,32,2,45,5,31};
		System.out.println("Enter element you want to search : ");
		int ele = sc.nextInt();
		isPresent(ele,a);
	}
}
