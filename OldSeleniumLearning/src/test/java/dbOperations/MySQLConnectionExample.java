package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//to mention type of DB used
		Class.forName("com.mysql.jdbc.Driver");  //com.mysql.jdbc.Driver->(syntax)
		
		//to create connect with DB
		Connection connection = DriverManager.
				getConnection("jdbc:mysql://root@localhost/selenium_users");
		//("jdbc:mysql://root@localhost/selenium_users","uname","pasword"); if username and password irunta

		//create statement  cfreating obj for statement
		Statement statement = connection.createStatement();
		//create query   executing query
		ResultSet result = statement.executeQuery("SELECT * FROM superheros_table");
		
		while(result.next()){
			System.out.println("Name:" + result.getString(1) + "  NickName:" + result.getString(2));
		}
	}

}
