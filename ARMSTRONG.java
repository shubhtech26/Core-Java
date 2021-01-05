import java.util.Scanner;
public class ARMSTRONG 
{
	public static void main(String[] args)

	{    
		int a,b,c=0;
		 System.out.print("enter a number");
			Scanner in=new Scanner(System.in);
	    
		 	a= in.nextInt();
		 	int d=0;
		 	d=a;
	     while (a>0)
	     {
	       b=a%10;
	       System.out.println(b);
	       a=a/10;
	       System.out.println(a);
           c=c+b*b*b;
     
	     }
	     System.out.print(c);
//	     if(d==c)
//	     	{
//	     	System.out.println("number is armstrong");	
//	     	}	
//	     	else
//	     	{
//	     	System.out.println("number is not armstrong");	
//	     	}
	     }
	     	
	 }

	     
	     
	     
	     
	     


