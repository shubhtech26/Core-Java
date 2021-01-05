class astrik
	{
		String name;
		int age;
	
	class bstrik
		{	
				public void show()
				{
	
					System.out.println("b");
	
				}

		}
	}



public class innerclassmember {

	public static void main(String[] args) {
		
		astrik obj = new astrik ();
		astrik.bstrik  obj1 =  obj. new bstrik();
		
		obj1.show();
		
	}
	
	
}
