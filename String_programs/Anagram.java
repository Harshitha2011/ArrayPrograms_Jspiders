package String_programs;

import java.util.Arrays;

public class Anagram {

	public static void anagram(String s1,String s2)
	{
		String s11 = s1.toLowerCase();
		String s22 = s2.toLowerCase();
		char[] a = s11.toCharArray();
		char[] b = s22.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		if (Arrays.equals(a, b)) {
			System.out.println("Anagram");
			
		}
		else
		{
			System.out.println("Not a anagram");
		}
	}
	public static void main(String[] args) 
	{
		String s1 = "racer";
		String s2 = "carer";
		if (s1.length()==s2.length()) 
		{
			anagram(s1, s2);
			
		}

	}
}
