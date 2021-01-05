package javapracticeset;

public class practiceset3 {

	public static void main(String[] args) {
		
		int n =123;
		int b,c=0;
		while (n>0)
		{
		b=n%10;
		c=(c*10)+b;
		n=n/10;
			
		}
System.out.println(c);
	
	}
	
	
}
