package method_overriding;

public class example2 extends example
{
 String m1(int y)
 {
	 System.out.print(y);
	 return sc.next();
 }
 public static void main(String[] args)
 {
	 example2 de =new example2();
	 System.out.print(de.m1(example.sc.nextInt()));
	 System.out.print(de.m1(example.sc.nextInt()));
 }
}
