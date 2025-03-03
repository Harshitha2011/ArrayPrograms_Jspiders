class FactorsOfArrayElements 
{
	public static void main(String[] args) 
	{
		int [] a ={24,12,55,64,23,3};

		for (int i=0;i<a.length ;i++)
		{
			for (int j=1;j<=a[i] ;j++ )
			{
				if (a[i]%j==0)
				{
					System.out.print(j+",");
				}
			}
			System.out.println(" factors of element at index "+i+" which is "+a[i]);
		}
	}
}
