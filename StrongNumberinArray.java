class StrongNumberinArray 
{
	public static void main(String[] args) 
	{
		int a[] = {145,2,1,34};
		for (int i=0;i<a.length ;i++ )
		{
			int sum = 0;
			int temp = a[i];
			while (temp!=0)
			{
				int ld = temp%10;
				int prod =1;
				for (int j=1;j<=ld ;j++ )
				{
					prod=prod*j;
				}
				sum =sum+prod;
				temp=temp/10;
			}
			if (sum==a[i])
			{
				System.out.print(a[i]+" ");

			}
		}
	}
}
