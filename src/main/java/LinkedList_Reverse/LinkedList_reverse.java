package LinkedList_Reverse;

public class LinkedList_reverse {
	public static class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
		 }


	static ListNode head;
	
public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
        return head;
        
        
    }

void printList(ListNode head)
{
	while(head != null)
	{
		System.out.println(head.val +" ");
		head = head.next;
	}
}
	

	public static void main(String[] args) {
		LinkedList_reverse list = new LinkedList_reverse();
		list.head = new ListNode(85);
		list.head.next = new ListNode(15);
		list.head.next.next = new ListNode(4);
		list.head.next.next.next = new ListNode(20)	;
		
		System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverseList(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
		
		
		
		

	}

}
