package method_overloading;

public class paytm extends payment
{
	String typeofpayment()
	{
		return "paytm";
	}

	public static void main(String[] args) 
	{
		paytm p=new paytm();
		upi u=new upi();
		netbanking n = new netbanking();
		System.out.print(p.typeofpayment());
		System.out.print(u.typeofpayment());
		System.out.print(n.typeofpayment());

	}

}
