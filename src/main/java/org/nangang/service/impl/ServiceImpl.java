package org.nangang.service.impl;

import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nangang.dao.NgEntityDao;
import org.nangang.dao.impl.NgEntityDaoImpl;
import org.nangang.entity.NgEntity;
import org.nangang.service.Service;

public class ServiceImpl implements Service {

	@Override
	public boolean insert(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Integer glId=Integer.valueOf(request.getParameter("glId"));			 String guanId=request.getParameter("guanId"); Integer tieCi=Integer.valueOf(request.getParameter("tieCi")); Date arriveTime=Date.valueOf(request.getParameter("arriveTime")); Integer tlId=Integer.valueOf(request.getParameter("tlId")); Float arriveHeight=Float.parseFloat(request.getParameter("arriveHeight"));
		Float leaveHeight=Float.parseFloat("leaveHeight"); Float preliu=Float.parseFloat("preliu"); Float afterliu=Float.parseFloat(request.getParameter("afterliu")); Integer isHit=Integer.valueOf(request.getParameter("isHit")); Integer preTem=Integer.valueOf(request.getParameter("preTem")); Integer afterTem=Integer.valueOf(request.getParameter("afterTem"));
		String modifier=request.getParameter("modifier"); Date date=Date.valueOf(request.getParameter("date")); String banCi=request.getParameter("banCi"); String zhanBie=request.getParameter("zhanBie"); String tieBaoBaoId=request.getParameter("tieBaoBaoId"); Integer baoAge=Integer.valueOf(request.getParameter("baoAge")); String luId=request.getParameter("luId");
		String gangZhong=request.getParameter("gangZhong"); String tieShuiQuXiang=request.getParameter("tieShuiQuXiang"); Date tieBaoLeaveTime=Date.valueOf(request.getParameter("tieBaoLeaveTime")); Date kRStartTime=Date.valueOf(request.getParameter("KRStartTime")); Date kROverTime=Date.valueOf(request.getParameter("KROverTime"));
		Integer goalLiu=Integer.valueOf(request.getParameter("goalLiu")); Integer liuDown=Integer.valueOf(request.getParameter("liuDown")); Date preBaBegin=Date.valueOf(request.getParameter("preBaBegin")); Date preBaOver=Date.valueOf(request.getParameter("preBaOver")); Date afterBaBegin=Date.valueOf(request.getParameter("afterBaBegin")); Date afterBaOver=Date.valueOf(request.getParameter("afterBaOver"));
		Integer danCon=Integer.valueOf(request.getParameter("danCon")); Integer tuoCycle=Integer.valueOf(request.getParameter("tuoCycle"));
		
		
		
		NgEntity ngEntity=new NgEntity(glId, guanId, tieCi,arriveTime,tlId,arriveHeight,
				leaveHeight,preliu, afterliu, isHit,preTem, afterTem,
				 modifier,  date, banCi,  zhanBie, tieBaoBaoId,  baoAge,  luId,
				 gangZhong,  tieShuiQuXiang, tieBaoLeaveTime, kRStartTime,  kROverTime,
				 goalLiu,  liuDown,preBaBegin, preBaOver, afterBaBegin, afterBaOver,
				 danCon,  tuoCycle);
		
		NgEntityDao ng= new NgEntityDaoImpl();
		
		
		try {
			return ng.insert(ngEntity);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String query(HttpServletRequest request, HttpServletResponse response, Date date, String banCi,
			String banBie, String zhanBie) {
		// TODO Auto-generated method stub
		return null;
	}


}
