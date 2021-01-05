import java.util.Scanner;

public class codechef100 {
	
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		for(int t =1;t<=n;t++)
		{
		int a,b,c=0;
		a = in.nextInt();
			
		while(a>0)
		{
		b=a%10;
		c=c*10+b;
		a=a/10;	
		}
		System.out.println(c);
		}

	}
}
