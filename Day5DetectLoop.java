package logic;
/*
 Today Interviewer asked me linkedList detecti loop problem so lets go and see all possible solutions
 
  case1: If data in linked list is unique the with the help of data in node we can find 
  But offtenly it wont asked so 
  case2:  put Node in HashSet if its not present previously and if it found it is present then return true otherwise false.(This
   is what I done in my interview)
   case3: On GFG I found a intresting method take two pointers and slow and fast like rabbit-turtle pair and move on it 
   they meet return true; else return false.
   So I try all of those specially 2 and 3 .
 * */
import java.util.*;

public class Day5DetectLoop 
{
	
	static Node head;
	static class Node
	{
		
		int data;
		Node next;
		Node(int data)
		{
			this.data= data;
			this.next=null;
		}
	}
	public void add(int newD)
	{
		Node newN= new Node(newD);
		newN.next=head;
		head=newN;		
	}
	
	static boolean detectLoop(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(slow !=null &&fast!=null &&fast.next!=null)
		{
			slow=slow.next;
			fast= fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false;

	}

public static void main(String[] args) 
{
	Day5DetectLoop Link= new Day5DetectLoop();
	//Node Link = new Node(1);
	Link.add(2);
	Link.add(3);
	Link.add(4);
	Link.add(10);
	Link.add(14);
	Link.add(2);
	System.out.println(Link.head.data);
	Link.head.next.next=Link.head.next;//loop creation
	System.out.println(detectLoop(Link.head));
	
}
}
