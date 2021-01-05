import java.util.*;
import java.io.*;

public class string {

	public static void main(String[] args)
	{  char a;
	   int b;
	   int c;
	   char d;
		String str="this is .. hello";
		char ch[]= {'s','h','u','b','h'};
		String st= new String(ch);
			System.out.println(str);
			System.out.println(st);
		    a =st.charAt(4);
		    b = st.hashCode();
		    c=st.compareTo(str);
		    System.out.println(a);  
		    System.out.println(b);
		    System.out.println(c);
		    System.out.println(st.concat(str));
		    System.out.println(st.contains(str));
		    System.out.println(st.indexOf('h'));
		    System.out.println(str.length());
		    System.out.println(str.replace('.','e'));
		    System.out.println(st.toUpperCase());
		    System.out.println(str.trim());



	} 
	
}
