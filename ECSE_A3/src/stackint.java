//this is a stack class for double 

public class stackint {
	// this class was created with the help of the class notes
	
		//method definition called push which adds objects on top of each other while being linked 
		void push(double arg) {
		listNode2 node= new listNode2();
		node.data=arg;
		if(top!=null)
		node.next=top;
		else node.next=null;
		//setting the top node of the stack so that the program won't terminate when pop is called
		top=node;
		
		                                                                                                                                                                                                                                                
	}
	//method definition called pop which reverses a stack previously made, starts from the top value all the way to the last value	
		double pop() {
			if (top==null) return (Double) null;
		double data=top.data;
			top=top.next;
			return data;
			
		}
		
	 

	//setting initial value of stack
	listNode2 top= null;



	public class listNode2 {
	double data;
	listNode2 next;
	}

	}

