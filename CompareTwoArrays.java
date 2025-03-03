class CompareTwoArrays 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,5,9,0};
		int[] b={1,2,5,9,8};
		if (a.length == b.length)
		{
			boolean isEqual = true;
			for (int i=0;i<a.length ;i++ )
			{
				if (a[i]!=b[i])
				{
					isEqual = false;
				}
			}
			if (isEqual)
			{
				System.out.println("Equal arrays");
			}
			else
			{
				System.out.println("unEqual arrays");
			}
		}
		else
		{
			System.out.println("UnEqual arrays");
		}
	}
}
