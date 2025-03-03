class  ArrayCreateStorePrint
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];  //creating an array
		a[0] = 5;
		a[1] = 4;
		a[2] = 6;
		a[4] = 2;        // strong values in an array
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);    // if there is no value stored at a index,the defaul value of that datatype is stored(here -0)
		System.out.println(a[4]);    //printing elements of an array
		 

	}
}
