import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("enter a number");
		Scanner in= new Scanner(System.in);
		a= in.nextInt();
		switch(a%2==0?1:2)
		{
		case 1 :
			System.out.print("a is even");
			break;
		case 2 :
			System.out.print("a is odd");
			break;
		
		}

	}

}
