import java.util.Scanner;
class SumofElementsinArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i=0;i<= a.length-1 ;i++ )
		{
			System.out.print("Enter the element at "+i+" index : ");
			a[i] = sc.nextInt();
		}
		int sum=0;
		for ( int i=0;i<= a.length-1 ;i++ )
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
