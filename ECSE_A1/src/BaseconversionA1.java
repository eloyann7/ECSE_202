import acm.program.ConsoleProgram;


/**
 * @author eloyann Roy-Javanbakht
 * @ID 260847568
* 	This Java Program Converts any number in base 2 to 16 into a decimal base and converts that number in any base chosen between 2 and 16
* This Program is based on the template from the hand out of assignment 1
*/
public class BaseconversionA1 extends ConsoleProgram {    //this is the main class of this program

public void run() {                    //run allows the program to run on an applet

println("Base conversion program"); //instruction for user


while(true) { 
	
	String input= readLine("Enter a number (Base 2-16): "); //instruction for user
if (input.equals("")) break; //terminate program if user input is " "

int inBase= readInt("Enter the corresponding base as an integer;"); //instruction for user


int numBase10 = String2decimalinteger(input,inBase); //method called to obtain the input number in base 10
println("The decimal equivalent of your input is "+numBase10); //first output of the number in base 10


int targetBase = readInt("Enter the target base for conversion (2-16): "); //instruction for user
String output = Dec2Base(numBase10,targetBase); //method called to obtain a number in the desired base
println(input+" Base-"+inBase+" ---> "+output+" Base-"+targetBase);  //second output of the converted number
println();
}

println("Program Terminated"); //if while loop breaks program will read this




}
	
	
	
	


private int String2decimalinteger(String input, int inBase) { //method to transform a number to base 10 
int power=1;
int sum=0;
int d;
int stringlength=input.length();
int i;


for (i=stringlength -1;i>=0;i-- ) { //iteration to obtain the value of each character of the string input
sum+= valueofcharacter(input.charAt(i))*power; //method called to convert character to number value
power=power*inBase;

	}


return sum; //returns the equivalent number in base 10
}
	


private int valueofcharacter(char c){ //method to obtain the value of a character in base 10
	if(c>='0' && c<='9')
		return(int)c-'0';
	else if (c=='A'||c=='a') 
return (int) 10;
	else if (c=='B'||c=='B') 
		return (int) 11;
	else if (c=='C'||c=='c') 
		return (int) 12;
	else if (c=='D'||c=='d') 
		return (int) 13;
	else if (c=='E'||c=='e') 
		return (int) 14;
	else if (c=='F'||c=='f') 
		return (int) 15;
	
	else return(int)0;
	
			}	



private String Dec2Base(int numBase10, int targetBASE) { //method to obtain a number in the desired base from the input converted in base 10
int n=numBase10;
int b=targetBASE;
int currentbit;
String convertednumber = "";

while(n>0) { //while loop with the algo to change base 
	currentbit=n%b;
	n=n/b;
	convertednumber+=Int2Char(currentbit);// call on the method that convert integer into character for output to user
	
			
}

String finalconvertednumber=reverseString(convertednumber); //reversing the string to have the correct output from the concentation

return finalconvertednumber;//returning final output


}


private String reverseString(String convertednumber) {//method to reverse string 
	
	String reverse = " ";
	
	for(int i =convertednumber.length()-1;i>=0;i--) {
	 reverse+=convertednumber.charAt(i);
	
	}
	
	return reverse;
}






char Int2Char (int digit) { //method converting integer into associated character
	 if(digit>=0 && digit<=9)
			return (char) ((char)'0'+digit);
	    else if (digit==10) 
		 return (char) 'a';
		 	else if (digit==11) 
		 		return (char) 'b';
		 	else if (digit==12) 
		 		return (char) 'c';
		 	else if (digit==13) 
		 		return (char)'d';
		 	else if (digit==14) 
		 		return (char) 'e';
		 	else if (digit==15) 
		 		return (char) 'f';  
	  
		else 
			return (char) ((char)'0');
	 
 }



}




	
	
	
