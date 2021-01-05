

public class abstraction {

	public static void main(String[] args)
	{
	
	  iphone obj=new iphone();
	  show(obj);
	  
	samsung obj1 = new samsung();
	show(obj1);
	
	}
	
	public static void show (phone obj ) {
	obj.showconfig();
	}

	//public static void show (samsung obj1 ) {
	// obj1.showconfig(); (not required due to abstraction) we will pass phone on in show method
	//}
	

	
}
abstract class phone
{

	public abstract void showconfig();
	
}
class iphone extends phone {
	
	public void showconfig()
	{
	System.out.println("iphone ios 9");
	}

	
}


class samsung  extends phone
{
	public void showconfig()
	{
	System.out.println("android  lollipop 8");
	
	}
}
abstract class sureshphone
{
	public void call()
	{
	System.out.println("calling");
	}
		public abstract void dance();
		public abstract void sing();
		public abstract void move();
	}