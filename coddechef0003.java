import java.util.Arrays;
import java.util.Scanner;
public class coddechef0003 {
	public static void main(String[] args)throws java.lang.Exception  {
				int t,sum;
				Scanner in = new Scanner(System.in);
						t = in.nextInt();

						for(int i =1; i<=t;i++)
						{
						
							int a = in.nextInt();
							int b = in.nextInt();
							int c = in.nextInt();
							sum =a+b+c;
							if (sum==180)
							{
							System.out.println("yes");
							}
							else
							{
							System.out.println("No");	
							
							
							}
							
							
						}
}
}