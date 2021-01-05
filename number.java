import java.util.Scanner;

public class number {
	public static void main (String[] args) 
	{
		int a,b;
		int c;
		  System.out.print("enter a number");
		Scanner in=new Scanner(System.in);
    
	 	a= in.nextInt();
		b =in.nextInt();
		c=(a>b?1:b>a?2:0);
          switch(c)                               
          {
          case 1:
        	  System.out.println("a is greatest");
        	  break;
          case 2:
        	  
        	  System.out.println("b is greatest");
        	  break;
        	  
          case 0:
        		  System.out.print("NO ARE EQUAL");
        		  break;
        		  
        	  
          }
        
		
		
	}
}