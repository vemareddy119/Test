package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {
public static void main(String[] args) throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vema", "vema");
	PreparedStatement pstmt=con.prepareStatement("insert into pstmttab values(?,?,?)");
	pstmt.setInt(1, 400);
	pstmt.setString(2, "ab");
	pstmt.setDouble(3, 800);
	int i=pstmt.executeUpdate();
	if(i==1) {
		System.out.println("Data Inserted");
	}else {
		System.out.println("no data inserted");
	}
}
}
