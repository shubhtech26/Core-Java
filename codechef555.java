import java.io.IOException;
import java.util.Scanner;
 
class codechef555 {

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
		while(a>0)
		{
		b=a%10;
		c=c+b;
		a=a/10;
		}
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
