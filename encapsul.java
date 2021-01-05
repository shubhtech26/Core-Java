import java.util.Scanner;
public class encapsul{
	static private int a;
	static private int b;
	static private int c;
	private static void insert(){
		 Scanner inp = new Scanner( System.in );
		System.out.println("enter a number");
		a= inp.nextInt();
		System.out.println("enter another number");
		b= inp.nextInt();
		}
	private static void add(){
		c=(a+b);
		System.out.println("The Result is " +c);
	}
	public static void main(String[] args) {
		insert();
		add();
		
	}
		
}
// this add function is  not visible to class 
/*class abc extends encapsul
{
public void abc	(){
	encapsul obj= new abc();
	obj.add();
}
}	
*/
	
	
