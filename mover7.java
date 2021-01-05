class bank
		{
	public void getbalance() 
			{
		System.out.println("NO AMOUNT RS 0");
			}
		}
	class banka extends bank
	{
			public void getbalance()
			{
				System.out.println("U have deposited RS 1000");

			}
	}

	class bankb extends bank
		{
		public void getbalance() 
			{
			System.out.println("U  have deposited rs 1500");

			}
		}
	class bankc extends bank
	{
	public void getbalance() 
		{
		System.out.println("u have deposited rs 2000");

		}
	}


public class mover7
	{
	public static void main(String[] args)
		{
		
		bank a = new bank();
		a.getbalance();
		bank d = new banka();
		d.getbalance();
		bank b = new bankb();
		b.getbalance();
		bank c = new bankc();
		c.getbalance();
		
	}

}
