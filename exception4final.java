import java.util.Scanner;
public class exception4final{
	
	
	public static void main (String[] args)
	{
		int a,b=1,c=0;
		 
		try {
			
			System.out.println("enter a number");
			Scanner in = new Scanner(System.in);
			a= in.nextInt();
			c= b/a;
		 System.out.println(c);

				}

	
		
	catch(Exception e) {
	
	System.out.println("this is systemerror");
	}
		finally {
			
			 System.out.println("bye");
		}
			
		}
		
	}

