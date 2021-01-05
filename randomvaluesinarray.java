import java.util.Random;

public class randomvaluesinarray {
	public static void main(String[] args)
	{
	Random r = new Random();	
	   
	int a[ ]=new int[40];
	
	for(int i=0;i<a.length;i++)

	{
		
	a[i]=r.nextInt(50);
	System.out.println(a[i]);
	}

}
}