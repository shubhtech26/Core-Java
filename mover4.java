class art  {
static double area(double l ,double b)
{
double a=  l*b;
return a;
}

static double area (double len )
{
double ar=len*len;
return ar;
}

}
public class mover4 {

	public static void main(String[] args) {
		System.out.println(art.area(10.0, 20.0));
		System.out.println(art.area(10.0));

	}
	
	
}
