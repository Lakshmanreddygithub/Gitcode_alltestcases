package Databasescripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databasetestexamples {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

	//DatabaseTest --------------------
		/*db methods-
		getConnection()
		createStatement()
		executeQuery()*/
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","myroot");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from tools");					
	//create a new table in the database 'places'
		String sql="create table places (LOCATION_ID decimal(4,0), STREET_ADDRESS varchar(40),POSTAL_CODE varchar(12),CITY varchar(30),STATE_PROVINCE varchar(25),COUNTRY_ID varchar(2))";
		stmt.execute(sql);
			//Connection connection = null;
			//ResultSet objResultSet=null;
			try {
		//DriverManager.registerDriver(new com.microsoft.jdbc.sqlserver.SQLServerDriver());
			String url="jdbc:microsoft:sqlserver://Servername:1717;DatabaseName=name of the database";
			System.out.println(">>>>>>>>>db Connected>>>>>>>>");
			String strQuery = "select * from emp"; 
			//Assigning the Query 
			//objPreStmnt = connection.prepareStatement(strQuery);
			//objResultSet = objPreStmnt.executeQuery(); //Executing the Query
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			 //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			 //Connection conn = DriverManager.getConnection("jdbc:odbc:ds1", "", "");
			 
			 while (rs.next())  {
			     System.out.println(rs.getString(1)+"---- "+rs.getInt(2) + "---- " + rs.getString(3));			     
			 }
			 con.close();
			 
	}

}
