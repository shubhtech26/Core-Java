import java.util.Scanner;
public class variablearguments
{
	
	public static void main(String[] args) 
	{
		int a;
				System.out.println("enter a number ");
				Scanner in = new Scanner(System.in);
						a  = in.nextInt();
			  display obj  = new display();
                 			  obj.show(a);
	}
}
		// we can pass obj.show(1,2,3); and it would work here
	/*we  can use java args  to  ...a to pass any any variable in methods 
	 *instead of creating another method in a class
	 *
	 */
	
	

 class display
 {
	 
	public void show(int...a) //variable arguments
	{
		for (int i :a)
		{
		
			System.out.println(i);
		
		}
	}
 }
 
 