package logic;

import java.util.HashSet;

public class Day4 
{
	 public static int count=0;
	    public static  int countArrangement(int n) 
	    {        
	        RecBackTrack(n,new HashSet<Integer> (),1); 
	        return count;
	    }
	    public static void  RecBackTrack(int n,HashSet<Integer> List,int c)
	    {
	        if(c>n)
	        {
	            count++;
	            return;
	        }
	          for(int i=1;i<=n;i++)
	          {
	            if(!List.contains(i) &&( i%c==0 || c%i==0)) //special case
	            {
	            	List.add(i);
	                System.out.println(List);
	                RecBackTrack(n,List,c+1);  //Recursion
	                System.out.println(List);
	                List.remove(i);            //Backtracking 
	            }
	            
	        }
	        
	    }

	public static void main(String[] args) 
	{
		int ret = countArrangement(5);
		System.out.println("Count: "+ret);
	}

}
