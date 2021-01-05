
public class innerclasslambdaexpression {
	
	public static void main(String[] args) {
		/*
		 * 
		 * 1 st form of implementation 
		b obj = new b()
		{
			public void show()
			{
			
			
			System.out.println("in b high are there");
			
			}	
				
		
				
		};
		
		2 nd form of implementation
		*/
		b obj = ()  ->
		
			
			{
			
			
			System.out.println("in b high are there");
			
			}	
				
		
				
		;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		obj.show();	
		
	}

}

interface  b {
	
  void show();

}