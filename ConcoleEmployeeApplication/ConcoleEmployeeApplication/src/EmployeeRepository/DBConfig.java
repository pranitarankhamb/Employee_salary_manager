package EmployeeRepository;
import java.sql.*;
public class DBConfig {
	protected Connection conn=null;
	protected PreparedStatement pmt=null;
	protected ResultSet rs=null;
	public DBConfig()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeproject","root","root");
			
		}
		catch(Exception ex)
		{
		System.out.println("Errot is-->"+ex);	
		}
	}
}
