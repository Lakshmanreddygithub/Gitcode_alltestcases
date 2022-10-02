package codeisfine_workingscripts;

public class Javacodingquesitions_fortestautomationdevelopers  {
	
	
}

	/*
	 * public static void main(String[] args) { //Question-1: Write code to filter
	 * duplicate elements from an array and print as a list? //findDuplicates
	 * ArrayList<String> list = new ArrayList<String>(); // Form a list of numbers
	 * from 0-9. for (int i = 0; i < 10; i++) { list.add(String.valueOf(i)); } //
	 * Insert a new set of numbers from 0-5. for (int i = 0; i < 5; i++) {
	 * list.add(String.valueOf(i)); } System.out.println("Input list : " + list);
	 * System.out.println("\nFiltered duplicates : " + processList(list)); } public
	 * static Set<String> processList(List<String> listContainingDuplicates) { final
	 * Set<String> resultSet = new HashSet<String>(); final Set<String> tempSet =
	 * new HashSet<String>(); for (String yourInt : listContainingDuplicates) { if
	 * (!tempSet.add(yourInt)) { resultSet.add(yourInt); }} return resultSet; }
	 */

//Question-2: Write code to sort the list of strings using Java collection?			
	/*
	 * // public class sortStrings { public static void main(String[] args) throws
	 * Exception {
	 * 
	 * String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
	 * "aug", "Sep", "Oct", "nov", "Dec" };
	 * 
	 * // Display input un-sorted list.
	 * System.out.println("-------Input List-------"); showList(inputList);
	 * 
	 * // Call to sort the input list. Arrays.sort(inputList);
	 * 
	 * // Display the sorted list.
	 * System.out.println("\n-------Sorted List-------"); showList(inputList);
	 * 
	 * // Call to sort the input list in case-sensitive order.
	 * System.out.println("\n-------Sorted list (Case-Sensitive)-------");
	 * Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
	 * 
	 * // Display the sorted list. showList(inputList); } public static void
	 * showList(String[] array) { for (String str : array) { System.out.print(str +
	 * " "); } System.out.println(); } }
	 */

//Question-3: Write a function to reverse a number in Java?

	/*
	 * public class invertNumber_reverseanumberinJava {
	 * 
	 * public long doInvert(long number) {
	 * 
	 * long invert = 0; while (number != 0) { invert = (invert * 10) + (number %
	 * 10); number = number / 10; } return invert; }
	 * 
	 * public static void main(String args[]) { long lnum = 654321; invertNumber
	 * input = new invertNumber();
	 * 
	 * System.out.println("Input value : " + lnum);
	 * System.out.println("Inverted value : " + input.doInvert(lnum)); } }
	 */

//Question-4: Write a method to check prime no. in Java?

	/*
	 * public static void main(String[] args) { Scanner scan = new
	 * Scanner(System.in); System.out.print("Enter an int value : "); int input =
	 * scan.nextInt(); if (checkPrime(input)) { System.out.println("Input value " +
	 * input + " is a prime number."); } else { System.out.println("Input value " +
	 * input + " is not a prime number."); } }
	 * 
	 * public static boolean checkPrime(int n) { if (n <= 1) { return false; } for
	 * (int i = 2; i < Math.sqrt(n); i++) { if (n % i == 0) { return false; } }
	 * return true; }
	 */

//Question-5: Write a Java program to find out the first two max values from an array?
	
	/* //class findTwoMaxValue { public void GetTwoMaxValues(int[] nums) {
	  
	  int maxOne = 0; int maxTwo = 0; for (int n : nums) { if (maxOne < n) { maxTwo
	  = maxOne; maxOne = n; } else if (maxTwo < n) { maxTwo = n; }
	  
	  }
	  
	  System.out.println("Max1 - " + maxOne); System.out.println("Max2 - " +
	  maxTwo); }
	  
	  public static void main(String[] args) {
	  
	  int list[] = { 15, 24, 48, 21, 43, 11, 79, 93 };
	  
	  Javacodingquesitions_fortestautomationdevelopers max = new Javacodingquesitions_fortestautomationdevelopers();
	  max.GetTwoMaxValues(list); } */
	 
	/*
	 * //Question-6: Write a Java program to find the longest substring from a given
	 * string which doesn’t contain any duplicate characters?
	 * 
	 * 
	 * //class findSubstr {
	 * 
	 * private Set<String> stringSet = new HashSet<String>(); private int lstringSet
	 * = 0;
	 * 
	 * public Set<String> findStr(String input) {
	 * 
	 * // Reset instance data. stringSet.clear(); lstringSet = 0;
	 * 
	 * // Set a boolean flag on each char's ASCII value. boolean[] flag = new
	 * boolean[256]; int j = 0; char[] inputCharArr = input.toCharArray(); for (int
	 * i = 0; i < inputCharArr.length; i++) { char c = inputCharArr[i]; if (flag[c])
	 * { extractSubString(inputCharArr, j, i); for (int k = j; k < i; k++) { if
	 * (inputCharArr[k] == c) { j = k + 1; break; } flag[inputCharArr[k]] = false; }
	 * } else { flag[c] = true; } } extractSubString(inputCharArr, j,
	 * inputCharArr.length); return stringSet; }
	 * 
	 * private String extractSubString(char[] inputArr, int start, int end) {
	 * 
	 * StringBuilder sb = new StringBuilder(); for (int i = start; i < end; i++) {
	 * sb.append(inputArr[i]); } String subStr = sb.toString(); if (subStr.length()
	 * > lstringSet) { lstringSet = subStr.length(); stringSet.clear();
	 * stringSet.add(subStr); } else if (subStr.length() == lstringSet) {
	 * stringSet.add(subStr); }
	 * 
	 * return sb.toString(); }
	 * 
	 * public static void main(String a[]) {
	 * 
	 * findSubstr substr = new findSubstr();
	 * 
	 * System.out
	 * .println("Actual Strings ------------ | ---- Longest Non-Repeated Strings");
	 * System.out.println("Software_Programmer" + "         |         " +
	 * substr.findStr("Software_Programmer"));
	 * System.out.println("Software_Developer_In_Test" + "  |         " +
	 * substr.findStr("Software_Developer_In_Test"));
	 * System.out.println("developers_write_unit_tests" + " |         " +
	 * substr.findStr("developers_write_unit_tests"));
	 * System.out.println("javajavbasp.net" + "             |         " +
	 * substr.findStr("javajavbasp.net")); } }
	 */
	
	
//Question-7: Write Java code to get rid of multiple spaces from a string?
//removeExtraSpaces
	  
	/*
	 * public static void main(String args[]){
	 * 
	 * String input = "Try    to    remove   extra   spaces."; StringTokenizer
	 * substr = new StringTokenizer(input, " "); StringBuffer sb = new
	 * StringBuffer();
	 * 
	 * while(substr.hasMoreElements()){ sb.append(substr.nextElement()).append(" ");
	 * }
	 * 
	 * System.out.println("Actual string: " + input);
	 * System.out.println("Processed string: " + sb.toString().trim()); }
	 */

//Question-8: Write Java code to identify a number as Palindrome?

//identifyPalindrome 
	  
	/*
	 * public static void main(String[] args) {
	 * 
	 * try { BufferedReader object = new BufferedReader(new
	 * InputStreamReader(System.in)); System.out.println("Input number"); int
	 * inputValue =Integer.parseInt(object.readLine()); int n = inputValue; int rev
	 * = 0; System.out.println("Input value is : "); System.out.println(" "
	 * +inputValue); for (int i = 0; i <= inputValue; i++) { int r = inputValue %
	 * 10; inputValue = inputValue / 10; rev = rev * 10 + r; i = 0; }
	 * System.out.println("Post reversal : " + " "); System.out.println(" " + rev);
	 * if (n == rev) { System.out.print("Input value is a palindrome."); } else {
	 * System.out.println("Input value is not a palindrome."); } } catch (Exception
	 * e) { System.out.println("Out of Range."); } }
	 */
	 
//Question-9: Write Java code to swap two numbers without using a temporary variable?

//smartSwapping {
	
	/*
	 * public static void main(String args[]) {
	 * 
	 * int numX = 10; int numY = 20; System.out.println("Pre-swapping state:");
	 * System.out.println("numX value: " + numX); System.out.println("numY value: "
	 * + numY); System.out.println(""); numX = numX + numY; numY = numX - numY; numX
	 * = numX - numY; System.out.println("Post-swapping state:");
	 * System.out.println("numX value: "+ numX); System.out.println("numY value: " +
	 * numY); }
	 */
	 	
//Question-10: Write a Java program to demonstrate string reverse with and without StringBuffer class?
	
	/*
	 * class invertString {
	 * 
	 * public String invertWithStringBuffer(String str) {
	 * 
	 * StringBuffer buffer = new StringBuffer(str); buffer.reverse(); return
	 * buffer.toString(); }
	 * 
	 * public String invertWithoutStringBuffer(String str) {
	 * 
	 * int length = str.length(); String original = str; String invert = ""; for
	 * (int i = length - 1; i >= 0; i--) { invert = invert + original.charAt(i); }
	 * return invert; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * invertString invertStr = new invertString();
	 * 
	 * System.out.println("Inverted String with StringBuffer class: " +
	 * invertStr.invertWithStringBuffer("987654321"));
	 * 
	 * System.out.println("");
	 * 
	 * System.out.println("Inverted String without StringBuffer class: " +
	 * invertStr.invertWithoutStringBuffer("kjihgfedcba")); } }
	 */
	 
//}




