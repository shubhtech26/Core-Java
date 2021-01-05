
public class animalobj {
	
	
	public void eat() {
		
		System.out.println("i m eating");
	}

	public void run()
	{
		System.out.println("i m running");
	}
    
	public static void main(String[] args)
	{

	
	animalobj cat = new animalobj();
	cat.eat();
	cat.run();
	 birds peacock = new birds();
	peacock.fly();
	
	}
	
	
}

 class birds{
	 
	 
	 public void fly()
	 {
	System.out.print("i m flying");
	 
	 }
 }