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
		conn=mySqlConn.getConn();			//在构造方法中连接数据库
	}
	
	public List<opcontentEntity> findByDate(Date date) {									//导入sql date类型 		只有年月日
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
//				map.put("高炉号", rs.getInt("glId"));
//				map.put("罐号", rs.getString("guanId"));
//				map.put("铁次", rs.getInt("tieCi"));
//				map.put("到达时间", rs.getDate("arriveTime"));
//				map.put("脱硫号", rs.getInt("tlId"));
//				map.put("到达重量", rs.getFloat("arriveHeight"));
//				map.put("离开重量", rs.getFloat("leaveHeight"));
//				map.put("脱前硫含量", rs.getFloat("preLiu"));
//				map.put("脱后硫含量",rs.getFloat("afterliu"));
//				map.put("是否命中",rs.getInt("isHit"));
//				map.put("脱前温度", rs.getInt("preTem"));
//				map.put("脱后温度",rs.getInt("afterTem"));
//				map.put("修改人", rs.getString("modifier"));
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
