package org.nangang.dao.impl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.nangang.dao.NgEntityDao;
import org.nangang.entity.NgEntity;
import org.nangang.sqlcon.mySqlConn;

public class NgEntityDaoImpl implements NgEntityDao{
	Connection conn=null;
	
	public NgEntityDaoImpl() {
//		mySqlConn sqlconn=new mySqlConn();
		conn=mySqlConn.getConn();
	}
	
	
	@Override
	public List<NgEntity> query(Date date, String banCi, String banBie, String zhanBie) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean insert(NgEntity ngEntity) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into `opcontent`(glId,guanId,tieCi,arriveTime,tlId,arriveHeight,leaveHeight,preliu,afterliu,isHit,preTem,afterTem,modifier,date,banCi,banBie,zhanBie,tieBaoBaoId,baoAge,luId,gangZhong,tieShuiQuXiang,tieBaoLeaveTime,KRStartTime,KROverTime,GoalLiu,LiuDown,preBaBegin,preBaOver,afterBaBegin,afterBaOver,danCon,tuoCycle) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(0, ngEntity.getGlId().toString());
		return false;
	}

	@Override
	public boolean delete(Integer tlId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(NgEntity ngEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<NgEntity> queryByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NgEntity> queryByBanci(String banCi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NgEntity> queryByBanbie(String banBie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NgEntity> queryByZhanBie(String zhanBie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NgEntity> queryByDateAndBanci(Date date, String banCi) {
		// TODO Auto-generated method stub
		return null;
	}

}
