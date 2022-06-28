import java.util.Scanner;
public class second_largest_element_in_an_array 
{
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Array elements:");
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		/*for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j]-(a[j]=a[i]);
				}
			}
		}
		
		System.out.print("Second largest element in an array:"+a[a.length-2]);*/
		
		int t=a[0]; int f=a[0]; int s=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>f)
			{
				t=s;
				s=f;
				f=a[i];
			}
			else if (a[i]>s)
			{
				t=s;
				s=a[i];
			}
		}
		if(f==s)
		{
			System.out.print(t);
		}
		else
		{
			System.out.print(s);
		}
	}
}
