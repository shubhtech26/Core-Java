import java.util.Scanner;           
public class table {
	
	public static void main (String[] args )
	{
		
		int a , b, c ;
		System.out.print("enter a number ");
		Scanner in= new Scanner(System.in);
		a= in.nextInt();
		for (b=1;b<=10;b++)
		{
		   
		c= a*b;
		
		System.out.println(a+"*"+b+"="+c);
		 
		
		
	}

}
}