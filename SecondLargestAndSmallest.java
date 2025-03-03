class SecondLargestAndSmallest
{
	public static void SecondLargestSmallest(int[] a)
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
				if (a[i]>largest)
				{
					largest = a[i];
				}
			}
			int largest2=0;
			for (int i=0;i<a.length ;i++ )
			{
				if (a[i]<largest && a[i]>largest2)
				{
					largest2 = a[i];
				}

			}
			System.out.println("Second Largest  element :"+largest2);
			int smallest = a[0];
			int smallest2=a[0];

				for (int i=0;i<a.length ;i++ )
				{
					if (a[i]<smallest)
					{
						smallest2=smallest;
						smallest = a[i];
					}
				}
				
				for (int i=0;i<a.length ;i++ )
				{
					if (a[i]<smallest && a[i]>smallest2)
					{
						smallest2 = a[i];
					}

				}
				System.out.println("Second Smallest element :"+smallest2);
		}
	}

	
		
	public static void main(String[] args) 
	{
		int a[] ={1,22,23,43,456,54,21,76,21};
		SecondLargestSmallest(a);
	}

}
