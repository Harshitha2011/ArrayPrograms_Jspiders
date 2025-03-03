import java.util.Scanner;
class ReverseSumNumberPalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print(" Enter a number : ");
		int num = sc.nextInt();
		boolean isPalindrome = false;
		while (isPalindrome==false)
		{
			int temp = num;
			int prod = 0;
			while (num!=0)
			{
				int ld=num%10;
				prod=prod*10+ld;
				num/=10;
			}
			num = temp+prod;
			temp=num;
			prod=0;
			while (num!=0)
			{
				int ld=num%10;
				prod=prod*10+ld;
				num/=10;
			}
			
			if (temp==prod)
			{
				isPalindrome = true;
				System.out.println(temp +" "+prod);
			}
			else
			{	
				num = temp+prod;
			}
		}

	}
}
