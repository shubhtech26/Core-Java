import java.util.Scanner;
public class sumoffirstnno {
public static void main(String[] args) {
	System.out.println("enter a no ");
	Scanner in = new Scanner(System.in);
    int	a=in.nextInt();
    int i=0 ,sum=0;
    for(i=0;i<=a;i++)
    {
	sum=sum+i;
    }
    System.out.println("the sum of first "+a+ "no's"+sum);
    
	
		}
}