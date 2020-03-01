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
            
            
        	obj.remove("B");
        	obj.remove(3);
        
        System.out.println("Linked List : " +obj);
        
       boolean status = obj.contains("F");
        
        if(status)
        {
        	System.out.println("It contains the required element");
        	
        }
   
        else
        {
        	System.out.println("It doesn't contain the element");
        	
        }
        
        int List_size;
        
       List_size = obj.size();
       System.out.println(List_size);
       
       obj.set(3, "U");
       System.out.println("Linked List : " +obj);
            
	}

}
