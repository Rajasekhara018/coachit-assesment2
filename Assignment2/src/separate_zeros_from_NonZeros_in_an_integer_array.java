
public class separate_zeros_from_NonZeros_in_an_integer_array 
{

	public static void main(String[] args) 
	{
		int []a= {1,0,3,0,5,6};
		int c=0;
		System.out.print("NonZero's in an integer array:");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>0)
			{
				c++;
				if(c==1)
				System.out.print(a[i]);
				else
				System.out.print(","+a[i]);	
			}
		}
		for(int i=0; i<a.length; i++)
		{
		if(a[i]==0)
				{
				System.out.print(","+a[i]);
				}
		}
	}
}
