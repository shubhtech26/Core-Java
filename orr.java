class Ajay{
	public void desc() {
		System.out.println("All animals are good.");
	}
}
class ani extends Ajay{
	public void desc() {
		System.out.println("Dogs are loyal");
	}
}
public class orr {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Ajay a= new Ajay();
		Ajay b= new Dog();
		a.desc();
		b.desc();
	}

}
