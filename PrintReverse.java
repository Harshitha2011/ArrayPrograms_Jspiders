import java.util.Scanner;
class PrintReverse
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner (System.in);
		int[] a = new int[5];

		for (int i=0;i<= a.length-1 ;i++ )
		{
			System.out.print("Enter the element at "+i+" index : ");
			a[i] = sc.nextInt();
		}

		for ( int i=a.length-1;i>=0 ;i-- )
		{
			System.out.println(a[i]); 
		}
	}
}
