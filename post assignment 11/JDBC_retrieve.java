package connect;
    import java.sql.Connection;
	import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
	import java.sql.Statement;

	public class JDBC_retrieve {

		

		
			public static void main(String args[]) throws ClassNotFoundException, SQLException
			{
				
				Class.forName("com.mysql.cj.jdbc.Driver");

				String url="jdbc:mysql://localhost:3306/test_db";
				String username="root";
				String password="Kgisl@123";
				Connection con=DriverManager.getConnection(url, username, password);
				Statement stmt=con.createStatement();
				String query="select*from narmu";
				ResultSet rs=stmt.executeQuery(query);//retrieve
				while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
				}
				
				
				System.out.println("retrieved successfully");
			}

		}





