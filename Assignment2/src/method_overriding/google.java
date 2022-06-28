package method_overriding;

public class google extends human
{
	void cycle()
	{
		System.out.print("Google driving cycle");
	}

	public static void main(String[] args) 
	{
		google gd =new google();
		gd.cycle();
	}

}
