import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class listinterface {
	public static void main(String[] args) {
		
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
		
		
		//values.forEach(System.out::println); lambada expression stream api to print out values
		
		
		
		
		
	}

}
