import java.util.Scanner;
public class indexarr {

	public static void main (String[] args)
	{
		int i,j,c=0;
			Scanner in = new Scanner(System.in);
			System.out.print("enter a size of array ");
					j=in.nextInt();
		
			int a []= new int[15];
						
				System.out.print("enter a no ");
				for (i=1;i<=j;i++)
					{			
						a [i]= in.nextInt();
					}
					i=0;
				System.out.print("enter a number to find index");
				c=in.nextInt();
				for (i=1;i<=j;i++)
				{
					if (a[i]==c)
					{
						System.out.print(i); 
						
					}
					else
					{
						System.out.println("the no is not found");
						
				}
					
					
				}			
					
					
	}
}
