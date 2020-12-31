

import java.awt.event.*;
import java.util.StringTokenizer;

import javax.swing.*;


	import java.awt.*;
	
 @SuppressWarnings("serial")
 //created with the notes available on mycourses made by prof ferrie 
 //online sources: 
 //https://stackoverflow.com/questions/27066881/gui-java-simple-calculator-using 

public class GUIcalculator extends JFrame implements ActionListener {
	 //initialize some data
	 String number="";
	 String postfix="";
 	String Evaluatedpostfixresult;
 	
	
	   // create a frame
	   static JFrame frame;

	   // create a textfield
	   static JTextField Postifinput;
	   static JTextField Answer;

	  

	   // main function
	   @SuppressWarnings("deprecation")
	public static void main(String args[])
	   {
	       // create a frame
	       frame = new JFrame("calculator");

	     

	       // create a object of class
	       GUIcalculator calcu = new GUIcalculator();

	       // create a textfields
	       Postifinput = new JTextField(16);
	       Answer= new JTextField(16);

	       // set the textfields to non editable
	       Postifinput.setEditable(false);
	       Answer.setEditable(false);

	     
	     

	       // create number buttons
	       JButton b0 = new JButton("0");
	       JButton b1 = new JButton("1");
	       JButton  b2 = new JButton("2");
	       JButton b3 = new JButton("3");
	       JButton b4 = new JButton("4");
	       JButton b5 = new JButton("5");
	       JButton  b6 = new JButton("6");
	       JButton  b7 = new JButton("7");
	       JButton   b8 = new JButton("8");
	       JButton  b9 = new JButton("9");

	       // equals button
	       JButton beq1 = new JButton("=");

	       // create operator buttons
	       JButton ba = new JButton("+");
	       JButton  bs = new JButton("-");
	       JButton  bd = new JButton("/");
	       JButton  bm = new JButton("*");
	       JButton beq = new JButton("^");
	       JButton bpl=new JButton("(");
	       JButton bpr=new JButton(")");
	       JButton bclear=new JButton("C");
	       // create . button
	       JButton be = new JButton(".");
	       //create quit Jbutton
	       JButton bquit= new JButton("Quit");

	       // create a panel
	       JPanel panel = new JPanel();

	       // add action listeners
	       bm.addActionListener(calcu);
	       bd.addActionListener(calcu);
	       bs.addActionListener(calcu);
	       ba.addActionListener(calcu);
	       b9.addActionListener(calcu);
	       b8.addActionListener(calcu);
	       b7.addActionListener(calcu);
	       b6.addActionListener(calcu);
	       b5.addActionListener(calcu);
	       b4.addActionListener(calcu);
	       b3.addActionListener(calcu);
	       b2.addActionListener(calcu);
	       b1.addActionListener(calcu);
	       b0.addActionListener(calcu);
	       be.addActionListener(calcu);
	       beq.addActionListener(calcu);
	       beq1.addActionListener(calcu);
	       bpl.addActionListener(calcu);
	       bpr.addActionListener(calcu);
	       bclear.addActionListener(calcu);
	       bquit.addActionListener(calcu);
	       
	       // add elements to panel
	       panel.add(Postifinput);
	       panel.add(Answer);
	       panel.add(ba);
	       panel.add(b1);
	       panel.add(b2);
	       panel.add(b3);
	       panel.add(bs);
	       panel.add(b4);
	       panel.add(b5);
	       panel.add(b6);
	       panel.add(bm);
	       panel.add(b7);
	       panel.add(b8);
	       panel.add(b9);
	       panel.add(bd);
	       panel.add(be);
	       panel.add(b0);
	       panel.add(beq);
	       panel.add(beq1);
	       panel.add(bpl);
	       panel.add(bpr);
	       panel.add(bclear);
	       panel.add(bquit);
	      
	       // set Background of panel
	       panel.setBackground(Color.blue);

	       // add panel to frame
	       frame.add(panel);

	       frame.setSize(200, 220);
	       frame.show();
	   }
	   //this method is called when an action is triggered
	   //was created with the notes on mycourses of Prof Ferrie
	   public void actionPerformed(ActionEvent e)  {
		   
		   
		  // reads the pressed button as a string 
		   String inputcalc=e.getActionCommand();
		   
		   // initialize the stack and queues for the shutting yard algorithm
		   Stackhomemade opStack = new Stackhomemade();
	        Queue Qin = new Queue();
	        Queue Qout = new Queue();
		   
		 
		   //if user presses b= get the result with these steps
		   if (inputcalc.equals("=")) {
             
          
          
		   
	        
		
	        
	        
	        
          
          
           
            	
            	
                    
                    
                    
                    StringTokenizer st = new StringTokenizer(number,"^%*/+-()",true);
            
            
            while  (st.hasMoreTokens()) {
            	Qin.enqueue(st.nextToken());
            }
                   In2pJ.shuntingYard(Qin,Qout,opStack);
                   
                   while(true) {
                   String s=Qout.dequeue();
                   if(s==null) break;
                 postfix =postfix+s; 
                 Queue postfixq= Qout;}
                   
                  
                 
                   Evaluatedpostfixresult=Double.toString(In2pJ.postfixEvaluate(postfix));
                
                 Postifinput.setText(number); 
                Answer.setText(Evaluatedpostfixresult); 
                           
    
		   
		   }
		   //if user presses these buttons we add the input to the current string and update the textfield
		   if (inputcalc.equals("1")){
			   number+="1";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("2")){
			   number+="2";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("3")){
			   number+="3";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("4")){
			   number+="4";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("5")){
			   number+="5";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("6")){
			   number+="6";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("7")){
			   number+="7";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("8")){
			   number+="8";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("9")){
			   number+="9";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("0")){
			   number+="0";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("(")){
			   number+="(";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals(")")){
			   number+=")";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("^")){
			   number+="^";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("+")){
			   number+="+";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("-")){
			   number+="-";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("*")){
			   number+="*";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals("/")){
			   number+="/";
			   Postifinput.setText(number);
		   }
		   if (inputcalc.equals(".")){
			   number+=".";
			   Postifinput.setText(number);
		   }
		   
		   //if user presses C we erase and start over 
		   if (inputcalc.equals("C")){
			   number="";
			   Evaluatedpostfixresult="";
			   postfix="";
			   
			   Postifinput.setText(number);
			   Answer.setText(Evaluatedpostfixresult);
			   
		   }
		   
		   //if user presses quit we exit program
		   if (inputcalc.equals("quit")){
			   System.exit(0);  
			   
		   }
		   
	   }  
	   }

