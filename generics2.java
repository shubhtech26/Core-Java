
class Container<T extends Number>
{
 T value;
 
 public void show()
 {
System.out.println(value.getClass().getName());
 }

public T getValue() {
	return value;
}

public void setValue(T value) {
	this.value = value;
}
 }
public class generics2 {
public static void main(String[] args) {
	
	Container<Integer> obj = new Container<>();
	obj.value=9;
	obj.show();
	
	
}

}
