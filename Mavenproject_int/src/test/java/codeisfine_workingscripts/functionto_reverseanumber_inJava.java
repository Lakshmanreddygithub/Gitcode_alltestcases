package codeisfine_workingscripts;


//Write a function to reverse a number in Java?

public class functionto_reverseanumber_inJava {
	
	//long 	doInvert return inevrt while loop
	public long doInvert(long number) {

		long invert = 0;
		
	//while loop
		
		while (number != 0) {
			invert = (invert * 10) + (number % 10);
			number = number / 10;
		}
		//use return to to return vakue which is stored in the variable
		return invert;
			}
	
	//main method
	
	public static void main(String args[]) {
		//given number
		long lnum = 987654321;
		//invoke method
		functionto_reverseanumber_inJava input = new functionto_reverseanumber_inJava();

		System.out.println("given value : " + lnum);
		
		System.out.println("Inverted value : " + input.doInvert(lnum));	
	}

}
