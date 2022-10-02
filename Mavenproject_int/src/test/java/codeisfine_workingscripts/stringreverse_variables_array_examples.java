package codeisfine_workingscripts;

public class stringreverse_variables_array_examples {
	
	//int add two integers example
	public static void add(int a,int b)	{
		int c=a+b;
		System.out.println(c);
	}
// string add example
	public static void add(String a,String b) {
		String c=a+b;
		System.out.println(c);
	}

//String reverse example---
	public static void Stringreverse() 	{
		String str="Interview";
		int len=str.length();
		System.out.println("stringrev length "+len);
		
		for (int i = len-1; i >=0 ; i--) {
			System.out.println(str.charAt(i));
		}
	}
	
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		add(1,2);//int add two integers example
		add("hi"," interview");//// string add example
		Stringreverse();//void method Stringreverse	
		
//String str=null----
				String str=null;
				str="interview";
				//int i=10;
				System.out.println("string value "+str);
//create string type array to store multiple values and create string type object.
				int rows;
				int columns;
//String inputData [] [] = new String [rows][columns];				
	
//Variable Declaration
	int a=100; //Initialization
	int b=200; //Variable Declaration with Initialization
	int c, d, e; //Declare multiple variables
	int f=40, g=50, h=60; //Declare multiple variables with initialization
				
				
			}
			
	}


