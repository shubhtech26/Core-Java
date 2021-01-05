import java.util.Scanner;
public class aarat {

	public static void main (String[] args)
	{
		int i,j,c=0;
			Scanner in = new Scanner(System.in);
			System.out.print("enter a size of array ");
					j=in.nextInt();
		
			int a []= new int[15];
			int b =0;
			
				System.out.print("enter a no ");
				for (i=1;i<=j;i++)
					{			
				
					a [i]= in.nextInt();
					b= b + a[i];
					c=((b)/(j));
					}

				System.out.print(c);
	}
}     