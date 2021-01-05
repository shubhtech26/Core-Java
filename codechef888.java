import java.util.Scanner;

public class codechef888 {
	
	
	public static void main(String[] args) {
		int no,n,d=0,c=0;
		Scanner in = new Scanner(System.in);
		        no = in.nextInt();
		
		  for(int z=1;z<=no;z++)
		
		  {
			  n =in.nextInt();
			  c=n%10;
			    
			  while(n>0)
			  
			  {   
				  d=n%10;
				  n=n/10;
				
				 
			  }
			  d=d+c;
			  System.out.println(d);
			  d=0;
			  n=0;
		  }	  
		
		
		
	}
	
	
	

}
