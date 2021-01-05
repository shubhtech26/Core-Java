
public class stringmutability {
  public static void main(String[] args) {
	
	  StringBuilder sbf = new StringBuilder("shubh");
	  //sbf.append("timmy");
	  sbf.replace(0 , 0,"priyo" );
	 //
	  sbf.delete(7, 10);
	  System.out.println(sbf);
	  
}
}