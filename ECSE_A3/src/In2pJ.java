






//this class was taking from the solution on mycourses for assignment 3 expect for the method evalPostfix

public class In2pJ  {
	
	static Character[] operators = new Character[] {'^','%','*','/','+','-'};
    static int[] oPrecedence = new int[] {4,3,3,3,2,2};

			
			
	
		// this method was created with the help of the documentation given by prof ferrie and the website http://toddgerspacher.blogspot.com/2013/01/shunting-yard-algorithm.html
	 
	public static void shuntingYard(Queue Qin, Queue Qout, Stackhomemade opStack) {
        String s,o;
       
        
        
        
        while ((s=Qin.dequeue()) != null) {                 // Get next token

        	
        	if (isOperator(s)) {
    while ((o=opStack.pop()) != null) {
        
    	if (Precedence(o) >= Precedence(s)) {
            Qout.enqueue(o);
}
     
    	else {
            opStack.push(o);

	 break;
	 
	 
}
    }
    
    opStack.push(s);
}

else if (s.charAt(0)=='(') {
    opStack.push(s);
}
else if (s.charAt(0)==')') {
    while ((o=opStack.pop()) != null) {
    
        if (o.charAt(0) != '(') {
            Qout.enqueue(o);
}
else {
break; 
}

    } 
    
}

else if (s.charAt(0) != ')') {
    Qout.enqueue(s);
}
        }
        
        while ((o=opStack.pop()) != null)
            Qout.enqueue(o);
}



	 
		 
		public static boolean isOperator(String token) {
			if (token.equals("+")|| token.equals("*")||token.equals("/")||token.equals("-")) return true;
			else return false;
	}

		private static int Precedence(String s) {
			  for (int i=0; i<operators.length; i++) {
		            if (s.charAt(0) == operators[i]) return oPrecedence[i];
		        }
		return 0; }
		
		@SuppressWarnings("deprecation")
		
	
//this method takes in a postfix string expression and returns int's corresponding value as a double, it was created after online research and the help of ferrie'S instruction 
		//information regarding the algorithm and code found on various sites: Chegg study and stackoverflow
public static double postfixEvaluate(String expression) {
	

    stackint list = new stackint();
  


    for (int i = 0; i < expression.length(); i++) {
        //setting current character
    	char currentchar = expression.charAt(i);
    	if(Character.isDigit(currentchar)) 
    		list.push((currentchar-'0')*1.0);
            
                 else {
                	 
                    

                    switch (currentchar) {
                        case '+':
                        	double n1=list.pop();
                        	double n2=list.pop();
                            list.push(n2 + n1);
                            break;
                        
                        
                        case '-':
                            n2=list.pop();
                        	 n1=list.pop();
                            list.push(n1 - n2);
                            break;
                        
                        
                        case '*':
                            n2=list.pop();
                            n1=list.pop();
                        	list.push(n1 * n2);
                            break;
                       
                        
                        
                        case '/':
                        	n2=list.pop();
                        	n1=list.pop();
                            list.push(n1 / n2);
                            break;
                            
                        case'^':
                        	n2=list.pop();
                        	n1=list.pop();
                        	list.push(Math.pow(n1, n2));
                        	break;
                        	

                        
                    }
                }
            }
    
        

    return list.pop();
}
}


		
	
		


