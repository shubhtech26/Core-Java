public class abstractdemo {
		public static void main(String[] args)
		{
	sureshphone obj = new maheshphone();
		obj.call();
		obj.dance();
		obj.sing();
		obj.move();
		}

}
abstract class rameshphone extends sureshphone
{
	public void move()
	{
		System.out.println("moving");
	}
	
}

 class maheshphone extends rameshphone
{
	public void dance()
	{
	System.out.println("dancing...");
	}
	
	public void sing()
	{
	System.out.println("singing...");
	
	}	
}	
