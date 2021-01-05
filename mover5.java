class degree
		{
	public void getdegree() 
			{
		System.out.println("i have got degree");
			}
		}
	class graduate extends degree
	{
			public void getdegree()
			{
				System.out.println("i am graduate");

			}
	}

	class undergraduate extends degree
		{
		public void getdegree() 
			{
			System.out.println("i m undergraduate");

			}
		}
	

public class mover5
	{
	public static void main(String[] args)
		{
		degree a = new degree();
		a.getdegree();
		degree b = new graduate();
		b.getdegree();
		degree c = new undergraduate();
		c.getdegree();
		
	}

}
