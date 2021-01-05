 class Animal{
	void eat()
	{
		System.out.println("Eating");
			}
}

class dog extends Animal{
	void run(){
		System.out.println("Running");
	}
	
}

public class singleinheritance{
	public static void main(String[] args){
		dog a1= new dog();
		a1.eat();
		a1.run();

	}
}