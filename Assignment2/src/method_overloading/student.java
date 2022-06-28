package method_overloading;

import java.util.Scanner;

public class student 
{
	static Scanner sc = new Scanner(System.in);
	
	String std()
	{
		return sc.next();
	}
	void std(String study)
	{
		System.out.print(study);
	}
	public static void main(String[] args) 
	{
		student de =new student ();
		de.std(sc.next());
		System.out.print(de.std());
	}

}
