package org.nangang.Test;
//package Test;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import sqlcon.mySqlConn;
//
//public class test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("q");
//		
//		Connection 	conn	=	null;
//		Statement	stmt	=	null;
//		ResultSet	rs		=	null;
//		String		sql		=	"select * from opcontent";
//		
//		try {
//			conn=mySqlConn.getConn();
//			stmt=conn.createStatement();
//			rs=stmt.executeQuery(sql);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			while(rs.next()) {
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			rs.close();
//			stmt.close();
//			conn.close();
//		}catch(Exception e) {}
//	}
//
//}
