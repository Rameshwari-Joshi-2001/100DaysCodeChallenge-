/*
 * The computing cluster has multiple processors, each with 4 cores. The number of tasks to handle is equal to the
   total number of cores in the cluster. Each task has a predicted execution time and each processor has a specified 
   time when its core becomes available. Assuming that exactly 4 tasks are assigned to each processor and those tasks
   run independently(asynchronously) on the cores of the chosen processor, what is the earliest time that all tasks 
   can be processed.
   Input:
   	processTime = [8,10]
	TaskTime = [2,2,3,1,8,7,4,5]
	
	Expected Output:
	16
 * */
package logic;

import java.util.ArrayList;
import java.util.*;

public class Day3MinProcessTime 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> processTime =new ArrayList<>();
		ArrayList<Integer> TaskTime = new ArrayList<>();
		processTime.add(20);
		processTime.add(10);
		TaskTime.add(2);
		TaskTime.add(3);
		TaskTime.add(1);
		TaskTime.add(2);
		TaskTime.add(5);
		TaskTime.add(8);
		TaskTime.add(4);
		TaskTime.add(3);
		processTime.sort(null);		
		TaskTime.sort(null);
		int k=0;
		int MinTime=0;
		Collections.reverse(TaskTime);
		for(int i=0;i<processTime.size();i++)
		{
			for(int j=0;j<4;j++)
			{
				int val=TaskTime.get(k)+processTime.get(i);
				k++;
				MinTime= Math.max(MinTime, val);
			}
		}
		System.out.print("Minimum Time Required to process all task: "+MinTime);
		// TODO Auto-generated method stub

	}

}
