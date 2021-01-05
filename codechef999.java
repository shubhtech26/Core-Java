import java.util.Scanner;

public class codechef999 {
	
	
	public static void main(String[] args) {
		int no,n,d=0,c=0;
		Scanner in = new Scanner(System.in);
		        no = in.nextInt();
		
		  for(int z=1;z<=no;z++)
		
		  {
			  n =in.nextInt();
			  
			    
			  while(n>0)
			  
			  {   
				  d=n%10;
				  if(d==4)
				  {
					  c=c+1;
				  }
				  n=n/10;
				
				 
			  }
			 
			  System.out.println(c);
			  c=0;
			  n=0;
		  }	  
		
		
		
	}
	
	
	

}
