import java.io.*;
public class checkedexception2 {
	
	   public static void main(String args[]) {
		      try {
		         int a[] = new int[2];
		         System.out.println("Access element three :" + a[3]);
		      }catch(ArrayIndexOutOfBoundsException e) {
		   
		      System.out.println("Out of the block");
		   }
		}

}
