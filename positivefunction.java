public class positivefunction {

	
	public  static int  positive(int a)
	
	{
		if (a>0)
		{
			return 1;

		}
	else 
		{
		  return 0; 
		}
		
	}
	
	
	public static void main(String[] args)
	{
		int b=-2;
		int c;
		
	c=positive(b);
			switch (c)

			{
			case 0:
				System.out.println(b +"is negative");

			case 1:
				System.out.println(b +"is positive");


			}
	}
}
