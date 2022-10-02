package codeisfine_workingscripts;

//import testscripts.Javacodingquesitions_fortestautomationdevelopers.invertString;

//Question-10: Write a Java program to demonstrate stringreversewith_andwithoutStringBufferclass?
//stringreversewith_andwithoutStringBufferclass
public class stringreversewith_andwithoutStringBufferclass {
	
//with stringbuffer
   public String invertWithStringBuffer(String str) {
	   
		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse();
		return
		buffer.toString();
    }
//without stringbuffer
	public String invertWithoutStringBuffer(String str) {	
		int length = str.length();
		String original = str;
		String invert = "";
//using for loop string reverse
		for	(int i = length - 1; i >= 0; i--) {
			invert = invert + original.charAt(i); }
		return invert;
	}	
	public static void main(String[] args) {
		
		stringreversewith_andwithoutStringBufferclass invertStr = new stringreversewith_andwithoutStringBufferclass();
		
		System.out.println("Inverted String with StringBuffer class: " +
		invertStr.invertWithStringBuffer("987654321"));		
		System.out.println("");		
		System.out.println("Inverted String without StringBuffer class: " +
		invertStr.invertWithoutStringBuffer("kjihgfedcba")); 
   }
	
  }

//Question-6: Write a Java program to find the longest substring from a given string which doesn’t contain any duplicate characters?
	/*
	 * public class findSubstr { private Set<String> stringSet = new
	 * HashSet<String>(); private int lstringSet = 0; public Set<String>
	 * findStr(String input) { // Reset instance data. stringSet.clear(); lstringSet
	 * = 0; // Set a boolean flag on each char's ASCII value. boolean[] flag = new
	 * boolean[256]; int j = 0; char[] inputCharArr = input.toCharArray(); for (int
	 * i = 0; i < inputCharArr.length; i++) { char c = inputCharArr[i]; if
	 * (flag[c]){ extractSubString(inputCharArr, j, i); for (int k = j; k < i; k++)
	 * { if (inputCharArr[k] == c) { j = k + 1; break;} flag[inputCharArr[k]] =
	 * false; } } else { flag[c] = true; } } extractSubString(inputCharArr, j,
	 * inputCharArr.length); return stringSet; } private String
	 * extractSubString(char[] inputArr, int start, int end) { StringBuilder sb =
	 * new StringBuilder(); for (int i = start; i < end; i++) {
	 * sb.append(inputArr[i]);} String subStr = sb.toString(); if (subStr.length()>
	 * lstringSet) { lstringSet = subStr.length(); stringSet.clear();
	 * stringSet.add(subStr); } else if (subStr.length() == lstringSet) {
	 * stringSet.add(subStr); } return sb.toString(); } public static void
	 * main(String a[]) { findSubstr substr = new findSubstr(); System.out.
	 * println("Actual Strings ------------ | ---- Longest Non-Repeated Strings");
	 * System.out.println("Software_Programmer" + "         |         " +
	 * substr.findStr("Software_Programmer"));
	 * System.out.println("Software_Developer_In_Test" + "  |         " +
	 * substr.findStr("Software_Developer_In_Test"));
	 * System.out.println("developers_write_unit_tests" + " |         " +
	 * substr.findStr("developers_write_unit_tests"));
	 * System.out.println("javajavbasp.net" + "             |         " +
	 * substr.findStr("javajavbasp.net")); } }
	 */