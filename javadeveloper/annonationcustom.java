package javadeveloper;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone
 {
	String os() default"Symbian";
	int versions() default 1;
	
	
 }


@Smartphone(os="android",versions=6)
class Anokiaseries
{
String Model;
int size;
public Anokiaseries(String model, int size) {
	
	Model = model;
	this.size = size;
}


}
public class annonationcustom {
	
	public static void main(String[] args) {
		
		
		Anokiaseries obj = new Anokiaseries("fire",5);
		Class c = obj.getClass();
			Annotation  an = c.getAnnotation(Smartphone.class);
			Smartphone  s = (Smartphone)an;
			System.out.println(s.os());
			
		
	}
	

}
