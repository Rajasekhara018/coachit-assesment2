package method_overriding;

public class Icicibank extends Bank
{
     int getrateofinterest()
     {
    	 return 9;
     }
     class test
     {
    	 public static void main (String[] args)
    	 {
    		 Sbibank s=new Sbibank();
    		 Icicibank i = new Icicibank();
    		 axisbank a =new axisbank();
    		 System.out.print(s.getrateofinterest());
    		 System.out.print(i.getrateofinterest());
    		 System.out.print(a.getrateofinterest());
    	 }
     }
}
