import java.io.IOException;
import java.util.Scanner;

public class codechef666 {

	public static void main(String[] args) throws IOException
	{
		
		try
		{
		Scanner in =new Scanner(System.in);
		int a,b,t,c=0;
		t=in.nextInt();
		for(int i=1;i<=t;i++)
		{
		a=in.nextInt();
		b=in.nextInt();
		c=a%b;
		System.out.println(c);
		c=0;
		}	
	
		}
		catch(Exception e)
		{
		return;
		}
		}
	}
