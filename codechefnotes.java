	import java.util.Scanner;
	public class codechefnotes {
		public static void main(String[] args)throws java.lang.Exception  {
					int t,mon,rem = 0;
					Scanner in = new Scanner(System.in);
							t = in.nextInt();

							for(int i =1; i<=t;i++)
							{
							mon= in.nextInt();
							int a[] = { 1,2,5,10,50,100};
							for (int j =0 ; j<=a.length ;j++)
							{
							rem = mon%a[j];
							}
						    System.out.println(rem);		
								
							}
	}
	}

