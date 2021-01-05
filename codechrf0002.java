import java.util.Arrays;
import java.util.Scanner;
public class codechrf0002 {
	public static void main(String[] args) {
				int t,c;
				Scanner in = new Scanner(System.in);
						t = in.nextInt();

						for(int i =1; i<=t;i++)
						{
						
							int a = in.nextInt();
							int b = in.nextInt();
							
							if(a>b)
							{
								
							System.out.println(a);
							
							}
							else
							{
						
								System.out.println(b);
							}	
								
				            c=a+b;
							
				            System.out.println(c);	
						}
}
}