package javadeveloper;
 class Myclast{
	int num;
	Myclast(){
		num=100;
	}
}
public class ConsDemo {

	public static void main(String[] args) {
		Myclast n1= new Myclast();
		Myclast n2= new Myclast();
		System.out.println("The first one is"+n1.num);
		System.out.println("The second one is" +n2.num);

	}

}
