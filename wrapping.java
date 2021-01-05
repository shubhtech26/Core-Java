
public class wrapping {
	public static void main(String[] args) throws Exception {
		
		int  i =5;
		Integer abc = new Integer (i);//wrapping putting somethin into object boxing
		Integer def = i ; //autoboxing
		int ghi = def.intValue();//unwrapping taking out from object 
	}

}
