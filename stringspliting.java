
public class stringspliting {
	public static void main(String[] args) {
		
		String  str =" shubhendra,shivangi ,shriya";
		System.out.println(str.split(","));
		String names[] = str.split(" , ");
		 for (String val : names)
		 {
			System.out.println(val); 
		
		 }
	}

}
