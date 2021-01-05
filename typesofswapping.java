
public class typesofswapping {
   
	public static void main(String[] args)
	{
		int a=5 ,b=4;    //no 1 technique
		int temp;
		temp=b;
		b=a;
		a=temp;
		System.out.println(b);
		System.out.println(a);
		int c=10,d=11;         //no 2 technoque
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(c);
		System.out.println(d);
		int e=10;int f=15;      //no 3 technique
		e=e^f;
		f=e^f;
		e=e^f;
		
	System.out.println(e);
	System.out.println(f);
			int  g= 13  ,h=15; //no 4 technique
			h=g+h-(g=h);
			System.out.println(g);
			System.out.println(h);
	}
		
}
