package EmployeeRepository;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class helper {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeproject","root","root");
		if(conn!=null)
		{
			PreparedStatement pmt=conn.prepareStatement("insert into date values(?,?)");
			pmt.setInt(1, 3);
			Date date=new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String strdate=formatter.format(date);
			pmt.setString(2, strdate);
			int val=pmt.executeUpdate();
			if(val>0)
			{
				System.out.println("date added");
			}
		}
		else {
			System.out.println("data base not connected");
		}
	
	//	System.out.println(strdate);
	}

}
