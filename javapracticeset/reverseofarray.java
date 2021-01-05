package javapracticeset;
import java.util.Scanner;
public class reverseofarray {
	
	public static void main(String[] args) {
		int j;
		System.out.println("enter the size of array");
		Scanner size = new Scanner(System.in);
		j = size.nextInt();
		System.out.println("enter the elements");
		int a[]= new int[15];
		
		for (int i =0; i<=j-1;i++)
		
	{
		Scanner in = new Scanner(System.in);
			a[i]=in.nextInt();
	}
		
System.out.println("inputarray");
		
		
		for (int i =0; i<=j-1;i++)
			
		{
			System.out.print( a[i]);
		}
	
		
		
int low = 0;
int high = j-1;

			while(low<high)
	
		{
				
				int temp = a[low];
				a[low]=a [high];
				a [high]= temp;
				
		low++;
		high--;
		
		}	
			System.out.println("");
	System.out.println("reverse array");
	for (int i =0; i<=j-1;i++)
		
	{
		System.out.print( a[i]);
	}



		
		
		
	}
}