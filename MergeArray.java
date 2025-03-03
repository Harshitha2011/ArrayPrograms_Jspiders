class MergeArray 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4};
		int[] b={5,6,7,8,9};
		int[] c=new int[a.length+b.length];
		
		for(int j=0;j<=a.length-1;j++)
			{
				c[j]=a[j];
			}
		for(int i=0;i<=b.length-1;i++)
		{
			c[a.length+i]=b[i];
		}
		
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
