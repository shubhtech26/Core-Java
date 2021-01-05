import java.util.Iterator;
import java.util.Vector;

public class vectorinterface {
 
	public static void main(String[] args) {
		
		Vector<Integer> values = new Vector();
		values.add(3);
		values.add(4);
		values.add(3);
		values.add(4);
		values.add(3);
		values.add(4);
		values.add(3);
		values.add(4);
		values.add(3);
		values.add(4);
		values.add(3);
		values.add(4);
		values.add(3);
		values.add(4);
		values.add(2,3);
		values.remove(1);
		
		
		Iterator<Integer> i =values.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		System.out.println(values.capacity());
	
	}
}
