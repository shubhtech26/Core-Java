interface abc
{
void show();
}
 
class abcimpl implements abc
{
  public void show()
  
  {

	System.out.println("this is interface example");
	  
  }
}



public class interaceexample {

public static void main(String[] args) {
	
	abc obj =new abcimpl();
	obj.show();
}

}
