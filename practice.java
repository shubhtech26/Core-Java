import java.util.Scanner;
public class practice
{
	public static void main(String[] args)
	{
		 
		
		Scanner in = new Scanner(System.in);
		int a =in.nextInt();
		int b =in.nextInt();
		int c=0 ,h=0;		
		for(int i=1;i<=a && i<=b;++i )
		{
			if (a%i==0 && b%i==0)
			{
				c=i;
			}

		}		
			h= a*b/c;
		
			System.out.println("hcf"+" " +c);
			System.out.println("lcm"+" "+h);
	
	}
}
