package javadeveloper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatoranonymousclassimplementation {
	
	public static void main(String[] args) {
		
		
		List values =new ArrayList();
		values.add(420);
		values.add(311);
		values.add(702);
		values.add(203);
		
		
	//	Collections.reverse(values);
		//anonymous class 
		Comparator<Integer> com = new compimpl()
		{
		public int compare(Integer o1,Integer o2)
		{
			if (o1%10>o2%10)
				return 1;
			
			return -1;
		}
		
		};
		Collections.sort(values,com);
		values.forEach(System.out::println);
		
		
	
		
	}
	

}
