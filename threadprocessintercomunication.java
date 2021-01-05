class Q
{
	int num;
	  
	public void put(int num)
	{
		System.out.println("put   "+ num  );
		this.num=num;

	}
	 
	public void get()
	
	{
		System.out.println("get  "+ num  );
	}
		
	

}
class producer implements Runnable{
			 
		Q q;

		public producer(Q q) {
			
			this.q = q;
			Thread t = new Thread(this ,"Producer");
			t.start();
		}
		
		public void run()
			
			{
		
				int i =0;
				while(true)
				{
				
				q.put(i++);
				try
				{ Thread.sleep(10);}  catch(Exception e) {}
			
				
				}
				
			}

		
	
		
}


class consumer implements Runnable
{

	Q q;

	public consumer(Q q) {
		
		this.q = q;
		
		Thread t = new Thread(this ,"Consumer");
		t.start();
	}
	
	
	public void run()
	
	{

		int i =0;
		while(true)
		{
		
		q.get();
		try
		{ Thread.sleep(10);}  catch(Exception e) {}
	
		
		}
		
	}
	
	
	
	
	
	
	
}
public class threadprocessintercomunication {

	public static void main(String[] args) {
		
			Q q = new Q();
			 new producer(q);
			 new consumer (q);
		
		
		
	}









}
