package javapracticeset;
import java.util.Scanner;
public class number {
	
	public static void main(String[] args)
	{
	int a,b,c,d;	
//	int no = 12345;
//	b =  no % 10 ;      
// 	c= no/10;
// 	System.out.println(b);
// 	System.out.println(c);
	int s=0;
	for (int i =1 ;i<=10;i++)
	{
	Scanner in = new Scanner(System.in);
	a= in.nextInt();
	s=s+a;
	}
	System.out.println(s);
	
	}
}
