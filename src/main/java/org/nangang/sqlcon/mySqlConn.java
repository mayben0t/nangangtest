package org.nangang.sqlcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class mySqlConn {
	private static Connection conn	=	null;
 //	private Statement stmt	=	null;	
	private	static	String driver="com.mysql.jdbc.Driver";
	private	static	String url="jdbc:mysql://localhost:3306/nangang?characterEncoding=utf8&useSSL=true";
	private	static	String user="root";
	private	static	String password="123456";
	
	public static Connection getConn() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(conn==null) System.out.println("error");
		return conn;
	}
	
	public static void closeConn() {
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}
