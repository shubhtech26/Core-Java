interface hello
{
	void print();
}
public class cl implements hello
{
	public void print() 
	{
		System.out.print("Hello");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		cl obj1= new cl();
		obj1.print();

	}

}
