package javapracticeset;

public class methodarea {

	public static double area(int r)
		{
			double area = 3.14 *r*r;
			return area;
		}
	public static void main(String[] args)
	{
		int roc=2;
		double a;
		a =area(roc);
		System.out.println(a);
		
	}
}
