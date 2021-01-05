import java.util.Scanner;
public class multidimensionalarray {

public static void main(String[] args) {
	int k;
	System.out.println("enter the size of array");
	Scanner in1=new Scanner(System.in);
 	k= in1.nextInt();
	
	
	int i,j;
	
	int b [][]=new int[4][4];
	
	for ( i=0; i<k;i++ )
		{
		for( j=0; j<k;j++)
	
		{
		 	System.out.print("enter a matrix for a"+ "row"+ i+"column"+j);
		 	Scanner in=new Scanner(System.in);
		 	b[i][j]= in.nextInt();
		}	
			}
	
	for ( i=0; i<k;i++ )
	{
	for( j=0; j<k;j++)

	{
	 	
	 	
	 	System.out.print(b[i][j]+"  ");
	}	
		System.out.println();
	}

	}

	
	
}




/*
public class Ex2DArray
{
   public static void main(String args[])
   {
	   // initialize here.
       int row, col, i, j;
       int arr[][] = new int[10][10];
       Scanner scan = new Scanner(System.in);
	   
       // enter row and column for array.
       System.out.print("Enter row for the array (max 10) : ");
       row = scan.nextInt();
       System.out.print("Enter column for the array (max 10) : ");
       col = scan.nextInt();
	   
       // enter array elements.
       System.out.println("Enter " +(row*col)+ " Array Elements : ");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               arr[i][j] = scan.nextInt();
           }
       }
	   
       // the 2D array is here.
       System.out.print("The Array is :\n");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
       }
   }
}

 
*/
