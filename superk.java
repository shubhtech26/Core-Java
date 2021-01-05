
public class superk {
	public static void main(String[] args) {
		 
  B obj = new B();
	  obj.C();
	}
	
}	
	class A  extends Object{
		public void abc (){
		//super();
				System.out.println("in const a");
					}

	}

	
	class B extends A{

		public void  C (){
			super.abc();// due to this super class is runn
				System.out.println("in const b");
					}
			
		}
	
	
	
	
