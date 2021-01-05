import java.io.IOException;
import java.util.Scanner;

 class codechef22 {
	public static void main(String[] args) throws IOException {
		
		try
		
		{
		int n,k,ti,c=0;
		
	Scanner in = new Scanner(System.in);
	         n=in.nextInt();
	         k=in.nextInt();
	 
       for (int a=1;a<=n;a++)
       		{
    	   		ti= in.nextInt();
    	   		if(ti%k==0)
    	   		{
    	   		c++;	
    	   		}	

       		}
	
	System.out.println(c);
	
	}
	catch(Exception e)
	
	{
	return;
	}
	
	}
	
 }
