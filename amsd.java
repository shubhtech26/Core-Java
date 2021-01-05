
public class amsd {
	public static int add(int m, int n) {
		int f=(m+n);
		return f;
	}
	
	
	public static int mul(int m, int n) {
		int f=(m*n);
		return f;
	}
	
	public static int sub(int m, int n) {
		int f=(m-n);
		return f;
	}
	
	public static int div(int m, int n) {
		int f=(m/n);
		return f;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-45, b=33, c,d,e,f;
		c=add(a,b);
		d=mul(a,b);
		e=sub(a,b);
		f=div(a,b);
		System.out.println("The result is"+c);
		System.out.println("The result is"+d);
		System.out.println("The result is"+e);
		System.out.println("The result is"+f);

	}

}

		