public class stringbuilder1
	{
	
	public static void main(String[] args)
	{
		
		StringBuilder sbf = new StringBuilder("mahesh");
		sbf.append("REddy");
		System.out.println(sbf);
		sbf.replace(0, 4,"tommy");
		sbf.delete(0, 4);
		System.out.println(sbf);
		
	}
	
}
