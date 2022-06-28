package thiskeyword;

import java.util.Scanner;

public class thiskeyword_at_constructor_level 
{
	static Scanner sc = new Scanner(System.in);
	thiskeyword_at_constructor_level ()
	{
		System.out.print("raja");
	}
	thiskeyword_at_constructor_level (int x)
	{
		this();
		System.out.print(x);
	}
	thiskeyword_at_constructor_level (int y, String z)
	{
		this(sc.nextInt());
		System.out.print(y+" "+z+" ");
	}

	public static void main(String[] args) 
	{
		thiskeyword_at_constructor_level dc = new thiskeyword_at_constructor_level(sc.nextInt(), sc.next());

	}

}
