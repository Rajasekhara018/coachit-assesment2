package thiskeyword;

import java.util.Scanner;

public class thiskeyword_at_method_level 
{
	static Scanner sc = new Scanner(System.in);
	float m1(String a)
	{
		System.out.print(a);
		return sc.nextFloat();
	}
	int m1(boolean b)
	{
		System.out.print(m1(sc.next()));
		System.out.print(b);
		return sc.nextInt();
	}
	char m1(double c)
	{
		System.out.print(this.m1(sc.nextBoolean()));
		System.out.print(c);
		return sc.next().charAt(0);
	}
	
	public static void main(String[] args)
	{
		thiskeyword_at_method_level de =new thiskeyword_at_method_level ();
		de.m1(sc.nextDouble());

	}

}
