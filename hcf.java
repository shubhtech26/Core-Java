import java.util.Scanner;
public class hcf {
	public static void main(String[] args) 
	{
		int a[]= {24,36};
		int n1 =0;//3
		int n2 =0;//6
		int j=0;;
	    	for(int i=0;i<a.length-1;i++)

	    	{
	    		 n1 =a[0];//3
	    		 n2 =a[i+1];//6
	    		
	    		for(int l = 1; l <= n1 && l<= n2; ++l)//3,6,12
                {
        
                    if(n1 % l==0 && n2 % l==0)
                    {
                    		n1=i;
                    		
                    }
                }
	    				
	    	}
	    	System.out.println(n1);

	
	}
}