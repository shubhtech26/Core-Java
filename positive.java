import java.util.Scanner;
public class positive {
	public static void main(String[] args)
	{
		int a;
		System.out.println("enter a text");
		Scanner in= new Scanner(System.in);
		a= in.nextInt();
		switch(a>0?1:2)
		{
		case 1 :
			System.out.print("a is positive");
			break;
		case 2 :
			System.out.print("a is negative");
			
		
		}
}
}

