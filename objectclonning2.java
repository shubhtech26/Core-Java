
import java.lang.CloneNotSupportedException;  
public class objectclonning2 {
	
	public static void main(String[] args)throws CloneNotSupportedException {
		
		cone1 obj = new cone1();
		obj.i=5;
		obj.j=6;
		cone1 obj1 =(cone1) obj.clone();
		System.out.println(obj1);
		}
	}


class cone1 implements Cloneable//it is used to tell that this class is clonable
	{
	
	int i;
	int j; 
	public String toString()
	{
	return "abc(" + "i=" + i + " , j=" + j  + ')';
	
	}
	
	public Object clone() throws CloneNotSupportedException// it is used to manage exception
	{
	return super.clone();
	
	}
	}