package codeisfine_workingscripts;

public class JavaMethods_NonStaticmethod_withreturnavalue {
	
//JavaMethods - Create Object	
	
//Example:
	
//Non Static method with return a value
	public int add(int a, int b) {
	  int result = a+b;
	  
		return result;
	}
	
//main method started below
	public static void main(String[] args) {
//Create Object below line to invoke above method
		JavaMethods_NonStaticmethod_withreturnavalue obj = new JavaMethods_NonStaticmethod_withreturnavalue();
	
		int res= obj.add(100, 200);
		
	System.out.println(res);//300
	//Or
	System.out.println(obj.add(10, 20));//30
		}
	}
	

