class a
{
		int rollno;
		String name;
		
		static	class b
	{

		
		public void show()
		{

			System.out.println("HI IN B ");
		}
	
	}
}

public class innerclassnested {
	
	public static void main(String[] args) {
		a.b obj = new a.b(); //as the class is static
		obj.show();
		
	}

}
