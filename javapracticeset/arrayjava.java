package javapracticeset;
import java.util.Scanner;
public class arrayjava {
	public static void main(String[] args)
	{
		System.out.println("welcome to coming");
int i;	
int a [] = new int [15];
for(i =1;i<=10 ;i++)
	{
		Scanner in = new Scanner(System.in);
			a[i]= in.nextInt();
		
	}

for(i =1;i<=10 ;i++)
{
if(a[i]<a[i+1])
	
{
System.out.println();

}	
	
}

			System.out.println("done");

	}
	
}