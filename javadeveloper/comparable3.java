package javadeveloper;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
public class comparable3 {
	public static void main(String[] args) {
		
	
		List<student> coin = new ArrayList<>();
			coin.add(new student("shubhendra",22,26));
			coin.add(new student("srishty",26,18));
			coin.add(new student("shivangi",33,57));
			coin.add(new student("shanvi",21,12));
			coin.add(new student("siddharth",33,57));
			coin.add(new student("saurabh",33,57));

			Collections.sort(coin);
			coin.forEach(System.out::println);
	}
}

	class student implements Comparable<student>
	{
		String name ;
		int age;
		int rollno;
	public student(String name, int age,int rollno) {
		this.name = name;
		this.age = age;
		this.rollno= rollno;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", rollno=" + rollno + "]";

	}
	public int compareTo(student s)
	
	{
	
	return this.rollno>s.rollno?-1:this.rollno<s.rollno?1:0;
	
	}
	
	
	
	
	
	}