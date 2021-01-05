//import java.util.Scanner;
//
//public class codechef112 {
//	
//	public static void main(String[] args) {
//		int n;
//		int temp;
//		int a[] =new int [2];
//		Scanner in = new Scanner(System.in);
//		n=in.nextInt();
//				
//		for(int t =1;t<=n;t++)
//		{
// 		 for(int i=0;i<=2;i++)
// 		 {
// 		  a[i]=in.nextInt();
// 		 			if(a[i]<a[i+1])
// 		 			{
// 		 			    temp=a[i];
// 		 			    a[i]=a[i+1];
// 		 				a[i+1]=temp;	
// 		 					
// 		 			}
// 		 			
// 		 			}	
// 		for (int j=0;j<=2;j++)
// 		{
// 			System.out.println(a[j]);
// 			
// 		}
// 		 					
// 		  
// 		 
// 		 
// 		 
// 		 
// 		 
//				}	 	
//		}
//	
//
//
//
//}
//			
//			
//		
//		
//	
//
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class codechef112
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int p = sc.nextInt();
            int ans=0,item=2048;
            while(p>0)
            
            {
                ans=ans+p/item;
               // System.out.println(ans);
                p=p%item;
                System.out.println(p);
                item=item/2;
            }
            
        }
	}
}

