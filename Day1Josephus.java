package logic;

import java.io.*;

class Day1Josephus {

	static int josephus(int n, int k)
	{

		 if(n==1)
	        {
	            return 1;
	        }
	        
	        return (josephus(n-1,k)+k-1)%n +1;
	}
	public static void main(String[] args)
	{
		int n = 14;
		int k = 3;
		System.out.println("The chosen place is "
						+ josephus(n, k));
		//work in progress
//		int arr[] = new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=1;//it means all are alive;
//		}
//		
//        for(int i=k;i!=0;i=i+k)
//        {
//        	if(i>=n)
//        	{
//        		i= (i+1)%n-1;
//        	}
//        	if(arr[i]==1)
//        	{
//        		arr[i]=0;//killed
//        	System.out.println(i+":"+arr[i]);
//        	}	
//        }
	}
}

