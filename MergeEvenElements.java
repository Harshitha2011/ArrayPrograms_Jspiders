class MergeEvenElements 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4};
		int[] b={5,6,7,8,9};
		int count = 0;
		
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]%2==0)
			{
				count++;
			}
		}
		for (int i=0;i<b.length ;i++ )
		{
			if (b[i]%2==0)
			{
				count++;
			}
		}
		int c[] =new int[count];
		int j=0;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]%2==0)
			{
				c[j]=a[i];
				j++;
			}
		}

		for (int i=0;i<b.length ;i++ )
		{
			if (b[i]%2==0)
			{
				c[j]=b[i];
				j++;
			}
		}
		for (int i=0;i<count ;i++ )
		{
			System.out.print(c[i]+" ");
		}
		
	}
}
