package thiskeyword;

import java.util.Scanner;

public class thiskeyword_at_variable_level 
{
	static Scanner sc = new Scanner(System.in);
	int x =sc.nextInt();
	void display(int x)
	{
		System.out.print(this.x);
	}

	public static void main(String[] args) 
	{
		thiskeyword_at_variable_level cd = new thiskeyword_at_variable_level();
		cd.display(sc.nextInt());

	}

}
