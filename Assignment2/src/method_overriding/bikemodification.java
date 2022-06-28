package method_overriding;

public class bikemodification extends bike
{
	 void bkcolr()
	   {
		   System.out.print("black");
		   
	   }
	public static void main(String[] args) 
	{
		bikemodification bc = new bikemodification();
		bc.bkcolr();

	}

}
