package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemoJDBC {

	public static void main(String[] args) throws Exception { //throws exception because pf class.forname(..) will give class bot found exception because

		//first load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		//once we add mysql connector Jar file we will not get error
		System.out.println("Driver class loaded successfully");
		
		//connection
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Sanjay@209");
//		System.out.println("success");



		
		//statement either create statement or prepare statement
//		con.createStatement();
		//or prepared statement format 1
		PreparedStatement ps = con.prepareStatement(
			    "INSERT INTO REGISTER VALUES ('Varshini','v@gmail.com','123','Female')"
			);
		
		//Execute statement
		int  i = ps.executeUpdate();
		
		//process result
		if(i > 0) {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
		
		
		//format 2:
		String name = "Varshiani";
		String email = "vaa@gmail.com";
		String pass = "1234";
		String gender = "Female";
		
		PreparedStatement ps1 = con.prepareStatement(
			    "INSERT INTO REGISTER VALUES ('" + name + "', '" + email + "', '" + pass + "', '" + gender + "')"
			);

			ps1.executeUpdate();
			
		//Format 3 : this is best
		PreparedStatement ps2 = con.prepareStatement(
		    "INSERT INTO REGISTER VALUES (?, ?, ?, ?)"
		);

		ps2.setString(1, "Varshini");
		ps2.setString(2, "v@gmail.com");
		ps2.setString(3, "123");
		ps2.setString(4, "Female");

		ps2.executeUpdate();

		//every time we run this program again all ps ps1 ps2 will be added to table in db. so just keep 1 ps and change the values in it instead and run.
	}

}
