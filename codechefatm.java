import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

class codechefatm {

	public static void main(String[] args) throws IOException 
	{
		try 
		{
		double a ;
		double amount;
		Scanner sc = new Scanner(System.in);
		a=sc.nextDouble();
		amount= sc.nextDouble();
				
				if(amount>(a+0.50) && a>0 && a <= 2000 && a%5==0)
				{
		
					amount = amount - 0.50 - a;
					
					System.out.printf("%.2f",amount);
					
					//System.out.println(amount);
					
				}	
				else
				{
					System.out.printf("%.2f", amount);
				//System.out.println(amount);	
				}
				
		}
		catch(Exception e)
		{
		
		return;
		}
		}
	
	
	}

