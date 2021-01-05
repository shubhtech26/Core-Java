
public class biggestfunction {
	
			public  static int bigg(int a,int b,int c)
			
			{
				
				if (a>b)
				{
				 	if(a>c)
				 	{
				 		return  a;
				 	}
				 	else
				 	{
				 		return  c;	
				 	}
				}
				else 
				{
					if(b>c)
					{
						return b;

					}

					else
					{
						return c;
					}

				}

				
				
			}
			
			public static void main(String [] args)
			{
			
			int m=10; int q=20;int r=30;
			int c;
			c= bigg(m,q,r);
		    System.out.println(c+"is biggest");
			}
	}
