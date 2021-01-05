//class mobile
//{
//static final mobile APPLE =  new mobile();
//}
//this is converted into another form ||
//                     **********************************
import java.util.Scanner;



enum mobo
	{
	SAMSUNG(100) ,APPLE(90),HTC(80), MOTOROLA (60); //  SEMICOLON IS NOT NECESSARY
	int price;
	
	

	mobo(int p)
	{
	price=p;
	
	
	}
	
	
	
	public int getPrice() {
		return price;
	}
	
	}


public class enumexample111 {
	
	public static void main(String[] args) {
		
		
	System.out.println(mobo.APPLE .getPrice());
	
	}

}
