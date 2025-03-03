class EvenLargestElement 
{
	public static void Largest(int[] a)
	{
		if (a.length==0)
		{
			System.out.println("Empty Array!");
		}
		else
		{
			int largest = 0;
			for (int i=0;i<a.length ;i++ )
			{
				if (a[i]%2==0 &&a[i]>largest)
				{
					largest = a[i];
				}
			}
			System.out.println("Largest even element :"+largest);
		}

	}
	public static void main(String[] args) 
	{
		int a[] ={1,23,43,456,793,54,21,76,2};
		Largest(a);
	}
}
