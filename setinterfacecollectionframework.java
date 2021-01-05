import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;;

public class setinterfacecollectionframework {

		public static void main(String[] args) {
			
				//Set<Integer> values = new LinkedHashSet();
			Set<Integer> values = new TreeSet();//for sortinh
			values.add(3);
			values.add(4);
			values.add(3);
			values.add(5);
			values.add(36);
			values.add(45);
			values.add(13);
			values.add(41);
			values.add(39);
			values.add(40);
			values.add(32);
			values.add(42);
			values.add(3);
			values.add(4);
			values.add(2);
			
			
			Iterator<Integer> i =values.iterator();
			while(i.hasNext())
			{
			System.out.println(i.next());
			}
			
		
		}
	}
		



