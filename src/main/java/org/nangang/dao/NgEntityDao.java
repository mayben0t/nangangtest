package org.nangang.dao;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.nangang.entity.NgEntity;

public interface NgEntityDao {
	
		public List<NgEntity> query(Date date,String banCi,String banBie,String zhanBie);
		
		public List<NgEntity> queryByDate(Date date);
		
		public List<NgEntity> queryByBanci(String banCi);
		
		public List<NgEntity> queryByBanbie(String banBie);
		
		public List<NgEntity> queryByZhanBie(String zhanBie);
		
		public List<NgEntity> queryByDateAndBanci(Date date,String banCi);
		
//		public List<NgEntity> queryByDate(Date date,String banCi,String banBie,String zhanBie);
		
		
		
		public boolean insert(NgEntity ngEntity) throws SQLException;
		
		public boolean delete(Integer tlId);
		
		public boolean update(NgEntity ngEntity);
	

}
