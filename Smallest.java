class Smallest 
{
	public static boolean isEmpty(int [] a)
	{
		if(a.length==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean isNegative(int[] a)
	{
		for (int i=0; i<a.length;i++ )
		{
			if(a[i]<0)
			{
				return true;
			}
		}
		return false;
	}

	public static void smallest(int[] a)
	{
		int small =a[0];
		for (int i =0;i<a.length ;i++ )
		{
			if (a[i]<small)
			{
				small=a[i];

			}
		}
		System.out.println("Smallest element is : "+small);
	}


	public static void main(String[] args) 
	{
		int [] a={-1,2,3,4,5};
		if (isEmpty(a))
		{
			System.out.println("Array is Empty!!");
		}
		else if(isNegative(a))
		{
			System.out.println("Array containes negative element");
		}
		else
		{ 
			smallest(a);
		}

	}
}
