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

class babydog extends dog{
	void bark(){
		System.out.println("Barking");
	}
}
public class MULTI{
	public static void main(String[] args){
		babydog b1= new babydog();
		b1.eat();
		b1.run();
		b1.bark();

	}
}