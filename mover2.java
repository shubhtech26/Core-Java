class printnumber
{
static int printn(int a )
{
return a;
}

static double printn(double b)
{
return b;
}

static String printn(String s)
{
return s;

}
static boolean printn(boolean t)
{
return t;

}
static char printn(char a)
{
return a;

}




}

public class mover2
	{
		public static void main(String[] args)
	{  
	System.out.println(printnumber.printn(11));  
	System.out.println(printnumber.printn(11.076));  
	System.out.println(printnumber.printn("a"));
	System.out.println(printnumber.printn(false));
	System.out.println(printnumber.printn("a"));
	
	}
	
}
