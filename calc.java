import java.util.Scanner;

public class calc{
	
	public static void main (String[] args) 
	{
		int a,d,b,c;
		  System.out.print("enter a number 1:addition 2:subtraction 3: multiplication 4: division");
		Scanner in=new Scanner(System.in);
    
		a= in.nextInt();
		b =in.nextInt();
		c= in.nextInt();
		 switch(a)
		 {
		 case 1:
			 d = b + c ; 
			 System.out.print(d);
			 break;
		 case 2:
			 d = b - c ;
			 System.out.print(d);
			 break;
		 
		 case 3:
			 d = b * c ;
			 System.out.print(d);
			 break;
		 case 4:
			 d = b / c ;
			 System.out.print(d);
			 break;
			 
		default:
			System.out.print("wrong option choosen");
			break;
			 
			 
		 }
		 
		 
		 
	}
		 

}
     
		

		
		
		

		

