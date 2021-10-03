package logic;
/*
 Basic idea behind Reverse Linkedlist is that just  makes the pointers now pointing to previous node in simple word 
      !(Head  pointing to 1) 
 LL:> 1->2->3->4->5
                  !(Head pointing to 5)
 RLL:>1<-2<-3<-4<-5
 * */

public class Day6ReverseLL  {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)//constructor
		{
			data = d;
			next = null;
		}
	}
	static Node reverse(Node node)
	{
		//3 pointers prev,next,cur
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) 
		{
			//prev=null,next=null,cur=1
			next = current.next; //next=2
			current.next = prev;//1->null
			prev = current;     //1->1
			current = next;     //2->1
		}
		node = prev;
		return node;
	}
	void printLL(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		Day6ReverseLL  list = new Day6ReverseLL ();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);

		System.out.println("Given Linked list");
		list.printLL(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printLL(head);
	}
}


