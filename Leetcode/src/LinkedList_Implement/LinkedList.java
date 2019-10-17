package LinkedList_Implement;
import java.io.*;



public class LinkedList {
	
	     Node head;
	     
	     static class Node{
	    	 int data;
	    	 Node next;
	    	 
	    	 Node(int d)
	    	 {
	    		 data = d;
	    		 next = null;
	    		 
	    	 }
	     }
	     
public static LinkedList insert(LinkedList list, int data)    

{
	// Create a node
	
	Node new_node = new Node(data);
//	new_node = null;
	new_node.data = data;
	new_node.next = null;
	if(list.head == null)
	{
		list.head=new_node;
		
	}
	
	else
	{
		Node last = list.head;
		
		while(last.next !=null)
		{
			last = last.next;
			
		}
		
		last.next = new_node;
	}
	
	return list;
}


//Function to print the list

public static void printList(LinkedList list) {

   Node curr_node = list.head;
   
    while(curr_node != null)
    {
    	System.out.print(curr_node.data + " ");
    	
    	curr_node = curr_node.next;
    }



}


public static LinkedList deleteNode(LinkedList list, int index)
{
	Node Current_node = list.head;
	Node previous = null;
	
// If node to be deleted is at index 0, i.e head node
	
	if(index == 0 && Current_node != null)
	{
	list.head = Current_node.next;
	System.out.println("Element at position  " + index + "Deleted");
	return list;
	}
	
// If node to be deleted is not the head node and can be either in between or end.
	
	int count = 0;
	
	while(Current_node!=null)
	{
		if(count == index)
		{
			previous.next = Current_node.next;
			System.out.println("Element at position  " +index + "Deleted");
			break;
		}
		
		else
		{
			previous = Current_node;
			Current_node = Current_node.next;
			count++;
		}
	}
	
	if (Current_node == null)
	{
		System.out.println("Element not found in the list");
	}
	return list;
}

	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		
		obj = insert(obj, 1);	
		obj = insert(obj, 17);
		obj = insert(obj, 12);
		obj = insert(obj, 31);
		obj = insert(obj, 15);
		obj = insert(obj, 21);
		obj = insert(obj, 18);
		obj = insert(obj, 91);
		obj = insert(obj, 81);
		obj = insert(obj, 19);
		obj = insert(obj, 10);

		
		printList(obj);
		
		deleteNode(obj, 2);
		
		printList(obj);
		 
		//System.out.println(obj);
		

	}

}
