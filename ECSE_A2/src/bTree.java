//This bTree class was built on the notes from lecture 7 available on my courses McGill and written by Professor Ferrie
public class bTree {
	//creating an instance of Stack for each tree being called
Stack myStack= new Stack();
//setting first node
bNode root=null;
//this method will allow to add a new node onto the binary tree and placing it in it's corresponding place depending on it's value
public void addNode (String line){
bNode current;

//if binary tree is empty setting up the first value
if (root==null) {
root=makeNode(line);


	
}

else {
	//comparing the value we want to add to the tree to the current root we are comparing it too
	current=root;
	
	while (true) {
		if (current.line.compareToIgnoreCase(line) > 0) {
			
			
			if(current.left==null) {
				
				current.left=makeNode(line);
				break;
			}
			else {
				current=current.left;
				
			}
		}
		
		else {
			if(current.right==null) {
				current.right=makeNode(line);
				break;
				
			}
			else {
				current=current.right;
				
			}
		}
		
		
		
	}
	
	
	
}


}//end of binary tree add node method

// make node method allows to create a new node from data in this case a string from a text file
bNode makeNode(String line) {
	bNode node= new bNode();
	node.line = line;
	node.right = null;
	node.left=null;
	return node;	
	
}
// class defines what a bNode is in the context of this assignment and a binary tree
public class bNode {
	String line;

	bNode left;
	bNode right;
}

//this method traverses the tree in in-order traversal method aka smallest to largest 
public void alphabetically(bNode root) {
	
    if (root.left!= null) alphabetically(root.left);
  
    System.out.println(root.line);
    
    //puts values in a stack
    myStack.push(root.line);
    
  
    

  
    
	if (root.right!= null) alphabetically(root.right);
	
    
}

// this calls a instance of the previous method and prints out the names A-Z
public void alphabetically () {	
	
	System.out.println("File in sort order:");
	alphabetically(root); 
	
	System.out.println();
	
	
	
}
//this method uses the stack class to print the names from Z-A
public void reversealphabetically () {
	
System.out.println("File in reverse sort order:");

//uses the pop method to print out reverse order of the stacked names
while (true) {
String i=myStack.pop();
if(i==null) break;
System.out.println(i);


	
}



} }