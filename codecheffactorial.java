import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
public class codecheffactorial{
	public static void main(String[] args) throws IOException
	{
		try
		{
		Scanner in =new Scanner(System.in);
		int n,t;
		
		t=in.nextInt();
		for(int z=1;z<=t;z++)
		{
			BigInteger fact = new BigInteger("1");
			n=in.nextInt();
			for (int i=2;i<=n;i++)
			{
			fact=fact.multiply(BigInteger.valueOf(i));
			
			}
			
	System.out.println(fact);
	 
		}	
		}
		catch(Exception e)
		{
		return;
		}
		}
	}



