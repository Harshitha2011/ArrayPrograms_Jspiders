class RemoveDuplicates 
{
   public static void Duplicates(int[] a)
	{
		for (int i=0;i<a.length ;i++ )
	   {
		   int count =1;
		   for (int j=i+1;j<a.length ;j++ )
		   {
			   if (a[i]==a[j])
			   {
				   count++;
			   }
		   }
		   if (count==1)
		   {
				System.out.print(a[i]+" ");
		   }
	   }
	}
	   
    

	public static void main(String[] args) 
	{
		int[] a= {12,32,32,12,5,2,45,5,31};
		//System.out.println("Duplicate values are : ");
		Duplicates(a);

	}
}
