import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
 * @author Eloyann Roy-Javanbakht
 * @ID 260847568
 * This Java program reads an external text file of the user's choice containing a list of names
 * and reads each lines. Each lines is translated as a single String. Every String is later placed in a 
 * binary tree. The binary tree is then traversed in-order. The names now is A-Z order are stacked and printed out.
 * The stacked names are then popped and printed out in Z-A order 
 *   
 *
 */



/* 
 * This Class was coded mainly by using Professor Ferrie's 'Blueprint' given as a guide for assignment 2
 * The class was  altered  to fit this program and communicate with the other classes
 */


public class listFile {
	//Main class interacting with the user
	public static void main(String args[]) {
	//creating an instance of a binary tree (bTree class) per program run	
		bTree myTree= new bTree();
		
		
		
		// Prompt user for a file name. If no name is entered, terminate // the program, otherwise attempt to open the file. If file open
		// is not successful, prompt again for a new name. Keep doing this // until successful open, or a blank line is entered.
		System.out.println("Simple File Listing Program"); 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		BufferedReader rd = null;
		
		
		
		while(rd == null) {
		System.out.print("Enter name of file to list: "); 
		String filename = sc.nextLine();
		if (filename.equals("")) {
		System.out.println("Program terminated");
		System.exit(0); // Exit 
		}
		
		
		
		// Try to open the specified file
		try {
		rd = new BufferedReader(new FileReader(filename));
		}
		catch (IOException ex) {
		      System.out.println("Unable to open file, try again.");
		}
}

		
		System.out.println(""); 
		
		//when the program reads a line the  name is being placed in the binary tree through addNode method
		try {
			while (true) {
			String line = rd.readLine();
			
			if (line == null) break;
			myTree.addNode(line);
			
			// Read a line of text
			
			
			
			
			
			}
			
			
			 
			}
			catch (IOException ex) {
			System.out.println("I/O Error - program terminated");
			System.exit(-1); 
			}
		//printing a line for presentation purposes
		System.out.println("");
		//calling on the alphabetically method that sorts the names from the file A-Z and prints them out
		myTree.alphabetically();
		//calling on the reversealphabetically method that sorts the name from the file Z-A and prints them out
		myTree.reversealphabetically();
		//end program
			System.out.println("\n\nProgram terminated"); 
			}



	
	
	
	
	
}








			// Exit if at end of file // Print (or do whatever) // to current line