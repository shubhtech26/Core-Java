import java.io.InputStreamReader;
import  java.io.BufferedReader;

public class bufferreader{
	public static void main(String[] args)  throws Exception {
		System.out.println("enter a text");
		InputStreamReader ab  = new InputStreamReader(System.in);
		BufferedReader  br = new BufferedReader(ab);
		//int n = Integer.parseInt(br.readLine());
		String n= br.readLine();
		System.out.println(n);
	}

}