package method_overloading;

import java.util.Scanner;

public class payment1 
{
	static Scanner sc = new Scanner(System.in);
	String typeofpayment()
	{
		return sc.next();
	}
	void  typeofpayment(String a)
	{
		System.out.print(a);;
	}

	public static void main(String[] args) 
	{
		payment1 pc = new payment1();
		pc.typeofpayment(sc.next());
		System.out.print(pc.typeofpayment());

	}

}
