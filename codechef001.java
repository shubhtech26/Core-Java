import java.util.Arrays;
import java.util.Scanner;
public class codechef001 {
	public static void main(String[] args) {
				int t;
				Scanner in = new Scanner(System.in);
						t = in.nextInt();

						for(int i =1; i<=t;i++)
						{
						
						int a[] = new int[3];
						for (int j=0;j<3;j++)
							
							{
								a[j]=in.nextInt();
								
							
						
							}
							Arrays.sort(a);	
							System.out.println(a[1]);
						}
}
}