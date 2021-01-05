package javapracticeset;

public class patterset7 {
 
	public static void main(String[] args) {
	int a =123;int b,c=0;
	while (a>0)
	{
	b=a%10;
	System.out.println(b);
	c=c+b;	
	a=a/10;
	//System.out.println(a);
	}
	System.out.println(c);
	}
}
