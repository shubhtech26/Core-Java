
public class encapsulationgettersetter {
	
	public static void main(String[] args) {
	emp e1 =new emp();
	e1.setName("shubhendra singh");
	System.out.println((e1.getName()));
	e1.setEmpid(5);
	System.out.println((e1.getEmpid()));
	
	}
	
	
	

}

class emp
{
private static int empid;
private static String name;
public static String getName() {
	return name;
	
}
public static void setName(String name) {
	emp.name = name;
	
}
public static int getEmpid() {
	return empid;
}
public static void setEmpid(int empid) {
	emp.empid = empid;
}
	
}
