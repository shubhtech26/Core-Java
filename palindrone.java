import java.util.Scanner;
public class palindrone {
	
	
	public static void main(String[] args) {
		int a,b,c=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number");
		a = in.nextInt();
		b=a;
		
		while(a>0)
		{
		b=a%10;
		c=c*10+b;
		a=a/10;	
		}
		System.out.println(c);
		
//	
//	if (b==c)
//	{
//
//	System.out.println("no is palindrone");
//	}
//	else {
//		
//	System.out.println("no is not palindrone");	
//		
//		
//	}
//		
}
}