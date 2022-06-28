package method_overloading;

import java.util.Scanner;

  public class example
  {
    static Scanner sc = new Scanner(System.in);
      int m1(double a)
         {
	      System.out.print(a);
	       return sc.nextInt();
          }
      float m1(String b)
      {
	      System.out.print(b);
	       return sc.nextFloat();
       }
      char m1(int c)
      {
	      System.out.print(c);
	       return sc.next().charAt(0);
       }
	public static void main(String[] args)
	{
		example cd = new example();
		System.out.print(cd.m1(sc.nextDouble()));
		System.out.print(cd.m1(sc.next()));
		System.out.print(cd.m1(sc.nextInt()));

	}

}
