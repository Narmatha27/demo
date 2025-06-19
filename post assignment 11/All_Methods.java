package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class All_Methods {
	
	
	public static void insert(String url,String username,String password) throws ClassNotFoundException, SQLException
	{

		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		String query="insert into narmu values(4,'manisha',22)";
		stmt.executeUpdate(query);//insert,modify,update,delete
		System.out.println("inserted successfully");
	}
	public static void delete(String url,String username,String password) throws ClassNotFoundException, SQLException
	{

		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		String query="delete from narmu where id=3";
		stmt.executeUpdate(query);//insert,modify,update,delete
		System.out.println("deleted successfully");
	}
	public static void update (String url,String username,String password) throws ClassNotFoundException, SQLException
	{

		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		String query="update narmu set name='devi' where id=1";
		stmt.executeUpdate(query);//insert,modify,update,delete
		System.out.println("updated successfully");
	}

	public static void retreive (String url,String username,String password) throws ClassNotFoundException, SQLException
	{
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		String query="select*from narmu";
		ResultSet rs=stmt.executeQuery(query);//retrieve
		while(rs.next()){
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		
		System.out.println("retrieved successfully");
	}
	
	
	
	
 public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/test_db";
	String username="root";
	String password="Kgisl@123";
	Connection con=DriverManager.getConnection(url, username, password);
	Statement stmt=con.createStatement();
	insert(url,username,password);
	delete(url,username,password);
	update(url,username,password);
	retreive(url,username,password);
	
}
}
