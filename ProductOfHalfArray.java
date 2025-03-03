class ProductOfHalfArray
{
	public static void main(String[] args) 
	{
		int [] a ={2,3,4,3,5,6,5,2};

		int prod1 = 1;
		int prod2 = 1;

		for (int i=0;i<a.length ;i++ )
		{
			if(i<a.length/2)
			{
				prod1*=a[i];
			}
			else if (a.length/2<i)
			{
				prod2*=a[i];
			}
		}

		System.out.println("Product of first half is "+ prod1);
		System.out.println("Product of second half is "+ prod2);

	}
}
