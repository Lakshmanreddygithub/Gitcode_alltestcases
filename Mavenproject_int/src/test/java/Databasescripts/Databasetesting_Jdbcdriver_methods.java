package Databasescripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databasetesting_Jdbcdriver_methods {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//Selenium does not support Database Testing, still, it can be partially done using JDBC and ODBC.
		
		
//Which API is used for database testing in the Selenium web driver?
		//JDBC (Java Database connectivity) is used for database testing in Selenium.
		//This allows us to write the SQL (Structured Query Language) queries and execute them.		
		
//We use JDBC Driver to connect the Database in Selenium (While using Java Programming Language)
		/*
		 * JDBC is a SQL level API that allows us to execute SQL statements. It creates
		 * a connectivity between Java Programming Language and the database.
		 * 
		 * Using JDBC Driver we could do the following
		 * 
		 * i. Establish a Database connection ii. Send SQL Queries to the Database iii.
		 * Process the results
		 */
//Db Methods		
		//Connection con = DriverManager.getConnection("DataBaseURL", "userName", "password");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","myroot");
		Statement sqlStatement = con.createStatement();
		String sqlQuery = "SELECT * FROM table_name WHERE condition";
		ResultSet resSet = sqlStatement.executeQuery(sqlQuery);
//Fetching data from result set:
		
	while (resSet.next()) {
	    System.out.println(resSet.getString("required_column_name"));
	}	
//Script to update the data in the Database – Database Testing:
	
	String dbURL = "jdbc:sqlserver://ipAddress:portNumber/dbName";
	String username = "myUserName";
        String password = "myPassword";
        String Deletequery = "DELETE FROM <table_name>";
 //update query update database
        String updatequery = "UPDATE <table_name> SET <column_name> = <some_value>";
               
    	Statement stmt = con.createStatement();
    	stmt.executeUpdate(updatequery);  
    	stmt.executeUpdate(Deletequery); 
    	con.close();
	}
}


//Database Testing description summary details:-----

	/*
	 * We know Selenium WebDriver is a tool to automate User Interface and We could
	 * only interact with Browser using Selenium WebDriver.
	 * 
	 * We may face a situation where we want to get the data from the database or to
	 * update or delete the data from the Database. If we want to automate anything
	 * outside the browser, we need to use other tools to achieve the task. For
	 * Database connection and work on it, use JDBC API Driver.
	 * 
	 * JDBC API lets the user connect and interact with the Database and fetch the
	 * data based on the queries used in the automation script. JDBC is a SQL level
	 * API that allows executing SQL statements. It creates connectivity between
	 * Java Programming Language and the database.
	 * 
	 * To make a connection to the database the syntax is -
	 * 
	 * DriverManager.getConnection(URL, "userid", "password" ) where the user ID is
	 * the username in the database
	 * 
	 * Password of the configured user
	 * 
	 * URL format is 'jdbc:< dbtype>://ipaddress:portnumber/db_name'
	 * 
	 * <dbtype> is the driver for the database to be connected.
	 * 
	 * Code to create a connection is -
	 * 
	 * Connection con = DriverManager.getConnection(dbUrl,username,password); Code
	 * to load JDBC Driver -
	 * 
	 * Class.forName("com.mysql.jdbc.Driver"); Once connection is set, use Statement
	 * Object to send queries -
	 * 
	 * Statement stmt = con.createStatement(); Once the statement object is created
	 * use executeQuery method
	 * 
	 * stmt.executeQuery(select * from employee;);
	 */