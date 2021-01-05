import java.util.ArrayList;    
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class genrics3 {

	public static void main(String[] args) throws Exception {
		
		Collection values1 =new ArrayList();
		values1.add(4);
		values1.add(3);
		values1.add(7);
		
		       
			Iterator i = values1.iterator();
			while (i.hasNext())
			{
	
			System.out.println(i.next());
			
			}
			 System.out.println("LIST GENERATION");
			
			List values =new ArrayList();
			values.add(4);
			values.add(3);
			values.add(7);
			values.add(2, 23);
			Collections.sort(values);
			Iterator q = values.iterator();
			while (q.hasNext())
			{
	
			System.out.println(q.next());
			
			}
			
			
	}
	
}
