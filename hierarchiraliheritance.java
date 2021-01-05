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

class Tiger extends Animal{
	void roar(){
		System.out.println("Roaring");
	}
}


public class hierarchiraliheritance {


	public static void main(String[] args){
		dog a1= new dog();
		Tiger t1=new Tiger();
		a1.eat();
		a1.run();
		t1.eat();
		t1.roar();

	}
}