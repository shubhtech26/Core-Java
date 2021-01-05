import java.io.*;
public class checkedexception {
	   public static void main(String args[]) {
	    
   
		   try {
			     int a[] = new int[2];
	
			     
		         System.out.println("Access element three :" + a[3]);
			     
				    int i ,j,k;
				    j=8;
				    i=0;
				    k=j/i;
						       		         		         
		      }catch(ArrayIndexOutOfBoundsException e) {
		         System.out.println("Exception thrown  :" + e);
		      }
		   catch(ArithmeticException e) {
			   System.out.println("this isout ofbounds "+e);
			   
					   }
		   
		      System.out.println("Out of the block");
		   }
                   		}

