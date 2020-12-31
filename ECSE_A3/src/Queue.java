// this class was created with the help of the class notes
public class Queue {
	
	
	
	
	  void enqueue(String b) {
		listNode node = new listNode();
		node.data = b;
		node.next=null;
		if(rear !=null)
		   rear.next = node;
		else
			front=node;
		rear=node;
	   }
	  String dequeue() {
		  if(front!=null) {
			  if(front==rear) rear=null;
			  String j = front.data;
			  front = front.next;
			  return j ;
		  }
		  else
		return null;
		
		
	  }
	    class listNode{
	    	String data;
	    	listNode next;
	    }
	    	listNode front = null;
	    	listNode rear = null;
		
	    	
	    }
