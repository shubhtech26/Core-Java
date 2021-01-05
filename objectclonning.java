//deep copy
//shallow copy
//cloning
public class objectclonning {

	public static void main(String[] args) {
		//shallow copy example
		cone obj = new cone();
		obj.i=5;
		obj.j=6;
		cone obj1= new cone();// as we have not initialized a value
		cone obj2 =obj;// here we copy the value of object
		//cone obj3 =obj;this line 13,14,18 we see a shallow copy as we  change  the value
		//we see that initial object value also gets changed as only reference is chaged
		//obj3.j=8;
		//System.out.println(obj3);//5 ,8 = obj =obj3 old value is lost
		System.out.println(obj);
		System.out.println(obj1);//same so we get i =0 and j=0
		System.out.println(obj2);
	
		// deep copy example
		cone obj4 =new cone();
		obj4.i=obj.i; // in this type of copying we see that value of object is copied not referenced 
		obj4.j=obj.j;
		
		obj4.j=8;
		System.out.println(obj4);
			
		
	}
	
	
}
 
class cone
 	{
	
	int i;
	int j; 
	public String toString()
	{
	return "abc(" + "i=" + i + " , j=" + j  + ')';
	
	}
}