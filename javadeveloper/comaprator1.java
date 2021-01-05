package javadeveloper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comaprator1 {
		public static void main(String[] args) {
			
			
			List values =new ArrayList();
			values.add(420);
			values.add(311);
			values.add(702);
			values.add(203);
			
			
		//	Collections.reverse(values);
			Comparator<Integer> com = new compimpl();
					
							
			
			Collections.sort(values,com);
			values.forEach(System.out::println);
			
			
		
			
		}

	}

