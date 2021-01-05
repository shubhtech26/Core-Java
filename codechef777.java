import java.io.IOException;
import java.util.Scanner;
public class codechef777 {
	public static void main(String[] args) throws IOException
	{
		try
		{
		Scanner in =new Scanner(System.in);
		int a,b=1,t,c;
		t=in.nextInt();
		for(int i=1;i<=t;i++)
		{
			a=in.nextInt();
			for ( c=a;c>1;c--)
			{
			b=b*c;
			}
	System.out.println(b);
			b=1;
		}	
		}
		catch(Exception e)
		{
		return;
		}
		}
	}



