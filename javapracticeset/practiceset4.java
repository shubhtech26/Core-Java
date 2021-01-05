package javapracticeset;

public class practiceset4 {
public static void main(String[] args) {
	int b,a;
	int n =12345;
	 b=n%10;
	 a=b;
	 b=0;
	while (n>0)
	{
	b=n%10	;
	
	n=n/10;
	}
	System.out.println(b);
	System.out.println(a);
	System.out.println(a+b);
	
}
}
