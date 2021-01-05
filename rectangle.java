import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		  int  a , b , c , d;
		  System.out.println("enter a parameter length and breadth");
		    Scanner ch =new Scanner(System.in);
		    a = ch.nextInt();
		    b = ch.nextInt();
		    
		    System.out.println("enter a 1:area 2:parameter");
			c= ch.nextInt();
		   switch(c)
		   {
		   case 1:
			   d= a * b;
		   System.out.println(d);
		   
		   case 2 :
			   d= 2 * a + 2 * b ;		   
		   System.out.println(d);
	
		   
		   }
		   

		
		
		
		
		
	}

}
