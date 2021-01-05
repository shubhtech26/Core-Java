
public class exception6 {

	public static void main(String[] args) {
		int i=5;
		try {     
				if(i<10)
				{
					throw  new 	myException("Error");
					
				}
			}
		
        catch (Exception e)	
        {	
		System.out.println(e);
        }
	}
}

	class myException extends Exception
		{

	public myException(String msg)	

		{
	
		super(msg);
		
		}

		
		
		}