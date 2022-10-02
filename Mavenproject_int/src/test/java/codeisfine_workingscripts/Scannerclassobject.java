package codeisfine_workingscripts;

import java.util.Scanner;

public class Scannerclassobject {

	public static void main(String[] args) {
		
//Write a method to check prime no. in Java?	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an int value : ");	
		int input = scan.nextInt();
		
		if (checkPrime(input)) {
			System.out.println("Input value " + input + " is a prime number.");
		} else {
			System.out.println("Input value " + input
					+ " is not a prime number.");
		}
	}
	
	
	public static boolean checkPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;			
	

	}
}
