import java.util.Scanner;
class  OddElementsEvenIndex
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

		for ( int i=1;i<= a.length-1 ;i++ )
		{
			if(i%2==0 && a[i]%2==1)
			{
				System.out.println(a[i]);	
			}
		}
	}
}
