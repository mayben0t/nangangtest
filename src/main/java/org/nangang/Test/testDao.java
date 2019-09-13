package org.nangang.Test;


import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.nangang.dao.opcontentDao;
import org.nangang.entity.opcontentEntity;


public class testDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		opcontentDao od=new opcontentDao();
//		od.findByDate(date);
		String a="2018-04-02";
		Date date=Date.valueOf(a);
//		date.valueOf("2018-04-02");
		System.out.println(date);
		List<opcontentEntity> list=new ArrayList<opcontentEntity>();
		list=od.findByDate(date);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			opcontentEntity ope= (opcontentEntity) it.next();
			System.out.println(ope.toString());
		}
		
		od.close();
	}

}
