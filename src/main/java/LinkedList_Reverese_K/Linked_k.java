package LinkedList_Reverese_K;
import java.util.*;



public class Linked_k {
	static ListNode head;
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) 
		 { 
			 val = x; 
		 }
		 }

	
	public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        int flag = 0;
        int count = 0;
        
        while(count < k && current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
            flag++;
        }
        if(flag !=k)
        {
            return reverseKGroup(prev, flag);
        }
       else if((next != null) && (flag == k))
        {
            head.next =reverseKGroup(next, k);
             return prev;
        }        
        return prev;
    }
	
	public void push(int new_data)
	{
		ListNode new_node = new ListNode(new_data);
		
		
		new_node.next = head;
		head = new_node;
	}
	
	void printList()
	{
		ListNode temp = head;
		while(temp != null);
		{
			System.out.println(temp.val+ " ");
			temp = temp.next;
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Linked_k list = new Linked_k();
		
		list.push(9);
		list.push(8);
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		
		
		System.out.println(" Given Linked List");
		list.printList();
		
		
		list.head = list.reverseKGroup(list.head, 3);
		list.printList();
	}
	
	

}
