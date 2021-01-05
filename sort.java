
public class sort {
	
	
	public static void main(String[] args) 
	{
		int arr[] = {1,5,9,7,3,2,3};
		int  a,temp=0;
		
		for(int j =0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-j-1;i++)
			{
		//BigInteger a = new BigInteger(arr[i]);
		//BigInteger b = new BigInteger(arr[i+1]);
		
		     if(arr[i]>arr[i+1])
		     {
		      temp=arr[i];
		      arr[i]=arr[i+1];
		      arr[i+1]=temp;
		     }
		     
			} 
			
		}
	
		for(int j =0;j<arr.length;j++) 
		{
	System.out.println(arr[j]);
		}
	}

}

