import java.io.IOException;
import java.util.Scanner;

class codechef88  {
	
	public static void main(String[] args)throws IOException {
		
		try
		{
		int a,temp=0 ;
	Scanner in = new Scanner(System.in);
		a= in.nextInt();
	int n[]=new int[a];
	for(int i=1;i<a;i++)
	{
		n[i]=in.nextInt();
		
		if(n[i]>n[i+1])
			temp=n[i];
			n[i]=n[i+1];
			n[i+1]=temp;
	
	}
	
	
	
	for(int b=1;b<=a;b++)
	{
	
	System.out.println(n[b]);
	
	
	
	}
	
		}
		
		catch(Exception e)
		{
			return;
		}
		
	}

}
