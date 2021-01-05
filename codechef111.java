import java.util.Scanner;

public class codechef111 {
	
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		for(int t =1;t<=n;t++)
		{
		double a,b=0;
		long c;
		a = in.nextDouble();
		b = Math.sqrt(a);
		c = Math.round(b);
	    System.out.println(c);

		}

	}
}
