// this class was modeled after lecture notes 7 available on my courses created by professor Ferrie 

public class Stack {
	//method definition called push which adds objects on top of each other while being linked 
	void push(String ordered) {
	listNode node= new listNode()	;
	node.line=ordered;
	node.next=top;
	//setting the top node of the stack so that the program won't terminate when pop is called
	top=node;
	
	
}
//method definition called pop which reverses a stack previously made, starts from the top value all the way to the last value	
	String pop() {
		if (top==null) return null;
		String line=top.line;
		top=top.next;
		return line;
		
	}
	//class defining listNode 
private class listNode{
	String line;
	listNode next;
	
}
//setting initial value of stack
listNode top=null;

}
