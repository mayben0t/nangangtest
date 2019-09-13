package org.nangang.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Date;
import java.util.List;
import java.util.Map;

import org.nangang.entity.opcontentEntity;
import org.nangang.sqlcon.mySqlConn;



public class opcontentDao {
	Connection conn	=	null;
	PreparedStatement  pstmt	=	null;
	ResultSet  rs	=	null;
	
	public opcontentDao() {
		conn=mySqlConn.getConn();
	}
	
	public List<opcontentEntity> findByDate(Date date) {
		List<opcontentEntity> oplist=new ArrayList<opcontentEntity>();
		
		String sql="SELECT * FROM opcontent t WHERE t.arriveTime like ?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, date+"%");
			rs=pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(rs.next()) {
//				Map map=new HashMap<>();
				opcontentEntity op=new opcontentEntity();
				op.setGlId((Integer)rs.getObject("glId"));
				op.setGuanId(rs.getString("guanId"));
				op.setTieCi((Integer)rs.getObject("tieCi"));
				op.setArriveTime(rs.getDate("arriveTime"));
				op.setTlId((Integer)rs.getObject("tlId"));
				op.setArriveHeight(rs.getFloat("arriveHeight"));
				op.setLeaveHeight(rs.getFloat("leaveHeight"));
				op.setPreliu(rs.getFloat("preLiu"));
				op.setAfterliu(rs.getFloat("afterliu"));
				op.setIsHit((Integer)rs.getObject("isHit"));
				op.setPreTem((Integer)rs.getObject("preTem"));
				op.setAfterTem((Integer)rs.getObject("afterTem"));
				op.setModifier(rs.getString("modifier"));

				oplist.add(op);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return oplist;
	}
	
	public void close() {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e) {}
	}
}
