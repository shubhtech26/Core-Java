class printnumberchar
	{
public static void printto(int a, char c )
		{
			System.out.println(a);
			System.out.println(c);
		}

public static void printto(char d ,int e)
	{
		System.out.println(d);
		System.out.println(e);
	}
		}

public class mover3 
		{
	public static void main(String[] args)
	{  
		printnumberchar.printto(12,'a'); 
		printnumberchar.printto('a',12); 
	}
		
		}