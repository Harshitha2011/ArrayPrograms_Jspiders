class PrimeElements 
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,6,0,41,24,11,19};
		for (int i=1;i<=a.length-1;i++ )
		{
			boolean isPrime = true;
			for (int j=2;j<a[i];j++ )
			{
				if (a[i]%j==0)
				{
					isPrime=false;
				}
			}
			if(isPrime && a[i]!=0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}
