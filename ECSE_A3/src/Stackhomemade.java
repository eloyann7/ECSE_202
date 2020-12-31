// this class was created with the help of the class notes
public class Stackhomemade {
	//method definition called push which adds objects on top of each other while being linked 
	void push(String arg) {
	listNode node= new listNode();
	node.data=arg;
	if(top!=null)
	node.next=top;
	else node.next=null;
	//setting the top node of the stack so that the program won't terminate when pop is called
	top=node;
	
	                                                                                                                                                                                                                                                
}
//method definition called pop which reverses a stack previously made, starts from the top value all the way to the last value	
	String pop() {
		if (top==null) return null;
		String data=top.data;
		top=top.next;
		return data;
		
	}
	
 

//setting initial value of stack
listNode top= null;



public class listNode {
String data;
listNode next;
}

}
