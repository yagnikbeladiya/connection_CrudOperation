package connection_CrudOperation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MakeConnection {
	static Connection cn;	
	public static final String username="root";
	public static final  String password="manya123";
	public static final  String url = "jdbc:mysql://localhost:3306/student";
	public static Connection getConnection() {
 	
	try {
		//ste2 : load the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		/*step 3
		 * 1 : url/database
		 * 2  : username
		 * 3:password
		 */
		cn = DriverManager.getConnection(url,username,password);
	
		 
		//	System.out.println(cn);
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		
	}	
	return(cn);
		
	
	}


}
