package LinkedList;
import java.util.*;


public class linkedList {

	public static void main(String[] args) {
		
		LinkedList<String> obj = new LinkedList<String>();
		
		    obj.addFirst("A");
		    obj.add("B");
		    obj.add("C");
		    obj.add("E");
		    
		    obj.addLast("F");
		    
        System.out.println("Linked List : " +obj);
 
        
            obj.add(5,"G");
            
        System.out.println("Linked List : " +obj);
            
            
            
	}

}
